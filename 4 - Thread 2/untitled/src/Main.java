import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
//    private AtomicInteger value = new AtomicInteger();
//    Object lock = new Object();
//    private ReentrantLock lock = new ReentrantLock();
//   private Semaphore semaphore = new Semaphore(1);

    public synchronized void increment() {
        count++;

//        try {
//            semaphore.acquire();
//            count++;
//        } catch (InterruptedException e) {
//
//        } finally {
//            semaphore.release();
//        }


//        synchronized (lock){
//            count++;
//        }

//        lock.lock();
//        count++;
//        lock.unlock();

//        value.incrementAndGet();
    }

    public synchronized void decrement() {
        count--;


//       try {
//           semaphore.acquire();
//           count--;
//       } catch (InterruptedException e) {
//
//       } finally {
//           semaphore.release();
//       }

//        synchronized (lock){
//            count--;
//        }

//        lock.lock();
//        count--;
//        lock.unlock();

//        value.decrementAndGet();
    }

    public void clear() {
        count = 0;
    }

    public int getCount() {
        return count;
//        return value.get();
    }

    public void setCount(int count) {
        this.count = count;
    }
}


class IncrementTask extends Thread {
    private Counter counter;

    public Counter getCounter() {
        return counter;
    }

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            counter.increment();
        }
    }
}


class DecrementTask extends Thread {
    private Counter counter;

    public Counter getCounter() {
        return counter;
    }


    public DecrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            counter.decrement();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {


        //19:05



        System.out.println("Start");
        Counter counter = new Counter();
        IncrementTask incrementTask = new IncrementTask(counter);
        DecrementTask decrementTask = new DecrementTask(counter);

        incrementTask.start();
        decrementTask.start();

        incrementTask.join();
        decrementTask.join();

        Counter result = incrementTask.getCounter();
        System.out.println("Counter => " + result.getCount());

        System.out.println("End");


//        System.out.println("Start");
//        Counter counter1 = new Counter();
//        Counter counter2 = new Counter();
//        IncrementTask incrementTask = new IncrementTask(counter1);
//        DecrementTask decrementTask = new DecrementTask(counter2);
//
//        decrementTask.start();
//        incrementTask.start();
//
//        incrementTask.join();
//        decrementTask.join();
//
//        Counter result1 = incrementTask.getCounter();
//        Counter result2 = decrementTask.getCounter();
//        System.out.println("Counter => " + result1.getCount());
//        System.out.println("Counter => " + result2.getCount());
//
//        System.out.println("End");


//        System.out.println("Start");
//        IncrementTask incrementTask = new IncrementTask();
//        DecrementTask decrementTask = new DecrementTask();
//
//        decrementTask.start();
//        incrementTask.start();
//
//
//        incrementTask.join();
//        System.out.println("Counter ++ => " + incrementTask.getCounter().getCount());
//        decrementTask.join();
//        System.out.println("Counter -- => " + decrementTask.getCounter().getCount());
//        System.out.println("End");


//        System.out.println("Start");
//        int count = 0;
//        for (int i = 0; i < 10_000_000; i++) {
//            count++;
//        }
//        System.out.println("Count : " + count);
//
//        for (int i = 0; i < 10_000_000; i++) {
//            count--;
//        }
//        System.out.println("Count : " + count);
//        System.out.println("End");
    }
}