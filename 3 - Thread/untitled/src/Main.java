//class MyThread extends Thread {
//    private String result;
//
//   public String getResult() {
//        return result;
//    }
//
//    public void setResult(String result) {
//        this.result = result;
//    }
//
//    @Override
//    public void run() {
//        this.setName("MyThread");
//        System.out.println("Start  " + this.getName());
//        result = "Task done";
//        System.out.println(result);
//        System.out.println("End  " + this.getName());
//    }
//}


//class MyThread implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Start MyThread ");
//        System.out.println("Task done");
//        System.out.println("End MyThread" );
//    }
//}

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        Runnable runnableTask = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Task Runnable nacil vipolnenie " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    System.out.println("Task Runnable zaversil vipolnenie " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("Task Runnable bil prervan");
                    Thread.currentThread().interrupt();
                }
            }
        };


        Callable<Integer> CallableTask = () -> {
            System.out.println("CallableTask nacal vipolnenie " + Thread.currentThread().getName());
            Thread.sleep(5000);
            int result = 42;

            System.out.println("CallableTask viceslil rezultat : " + result + " , " + Thread.currentThread().getName());
            return result;
        };


        Callable<String> CallableWithExceptionTask = () -> {
            System.out.println("CallableWithExceptionTask nacal vipolnenie " + Thread.currentThread().getName());
            Thread.sleep(5000);
            double num = Math.random();
            if (num > 0.5) {
                throw new RuntimeException("Random error");
            }
            return "Vse okey";
        };


        try {
            Future<?> runnableFuture = executorService.submit(runnableTask);
            Future<Integer> CallableTaskFuture = executorService.submit(CallableTask);
            Future<String> CallableWithExceptionTaskFuture = executorService.submit(CallableWithExceptionTask);

            runnableFuture.get();
            System.out.println("Rezultat ot runnableFuture                 : none");
            System.out.println("Rezultat ot CallableTaskFuture              : " + CallableTaskFuture.get());

            try {
                System.out.println("Rezultat ot CallableWithExceptionTaskFuture : " + CallableWithExceptionTaskFuture.get());
            }catch (ExecutionException ex){
                System.out.println("Poymal osibku " + ex.getCause().getMessage());
            }

        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        } finally {
            executorService.shutdown();
        }


//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//
//        for (int i = 1; i <= 10; i++) {
//            int taskNum = i;
//            System.out.println(taskNum);
//
//            executorService.submit(()->{
//                System.out.println("Task "+taskNum+" nacal vipolnenie " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(10000);
//                    System.out.println("Task "+taskNum+" zaversil vipolnenie " + Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    System.out.println("Task "+taskNum+" bil prervan");
//                    Thread.currentThread().interrupt();
//                }
//            });
//        }
//        executorService.shutdown();


//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//
//        for (int i = 1; i <= 1000; i++) {
//            int taskNum = i;
//            System.out.println(taskNum);
//
//            executorService.submit(()->{
//                System.out.println("Task "+taskNum+" nacal vipolnenie " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(10000);
//                    System.out.println("Task "+taskNum+" zaversil vipolnenie " + Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    System.out.println("Task "+taskNum+" bil prervan");
//                    Thread.currentThread().interrupt();
//                }
//            });
//        }
//        executorService.shutdown();


//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//
//        for (int i = 1; i <= 100; i++) {
//            int taskNum = i;
//            System.out.println(taskNum);
//
//            executorService.submit(()->{
//                System.out.println("Task "+taskNum+" nacal vipolnenie " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(10000);
//                    System.out.println("Task "+taskNum+" zaversil vipolnenie " + Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    System.out.println("Task "+taskNum+" bil prervan");
//                    Thread.currentThread().interrupt();
//                }
//            });
//        }
//        executorService.shutdown();


//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//
//        Runnable task1 = () -> {
//            System.out.println("Task 1 nacal vipolnenie " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//                System.out.println("Task 1 zaversil vipolnenie " + Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                System.out.println("Task 1 bil prervan");
//                Thread.currentThread().interrupt();
//            }
//        };
//
//
//        Callable<String> task2 = () -> {
//            System.out.println("Task 2 nacal vipolnenie " + Thread.currentThread().getName());
//            Thread.sleep(500);
//            return "Hello world!";
//        };
//
//
//        try {
//            executorService.submit(task1);
//            Future<String> future = executorService.submit(task2);
//
//            System.out.println("Task 2 vernul : " + future.get());
//
//        } catch (InterruptedException | ExecutionException ex) {
//              ex.printStackTrace();
//        }finally {
//            executorService.shutdown();
//        }
//

//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        Runnable r = ()->{
//            System.out.println("Start MyThread ");
//            System.out.println("Task done");
//            System.out.println("End MyThread" );
//        };
//        Thread myThread = new Thread(r);;
//        myThread.start();
//        System.out.println("End " + mainThread.getName());


//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        Runnable r = ()->{
//            System.out.println("Start MyThread ");
//            System.out.println("Task done");
//            System.out.println("End MyThread" );
//        };
//        Thread myThread = new Thread(r);;
//        myThread.start();
//        System.out.println("End " + mainThread.getName());


//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        Thread myThread = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Start MyThread ");
//                System.out.println("Task done");
//                System.out.println("End MyThread" );
//            }
//        };
//        myThread.start();
//        System.out.println("End " + mainThread.getName());

//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        Thread myThread = new Thread(()->{
//            System.out.println("Start MyThread ");
//            System.out.println("Task done");
//            System.out.println("End MyThread" );
//        });
//        myThread.start();
//        System.out.println("End " + mainThread.getName());


//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Start MyThread ");
//                System.out.println("Task done");
//                System.out.println("End MyThread" );
//            }
//        };
//        Thread myThread = new Thread(runnable);
//        myThread.start();
//        System.out.println("End " + mainThread.getName());


//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        Thread myThread = new Thread(new MyThread());
//        myThread.start();
//        System.out.println("End " + mainThread.getName());


//        Thread mainThread = Thread.currentThread();
//        System.out.println("Start " + mainThread.getName());
//        MyThread myThread = new MyThread();
////        myThread.start();
//        System.out.println("End " + mainThread.getName());


//        Thread mainThread = Thread.currentThread();
//
//        System.out.println("Start " + mainThread.getName());
//        MyThread child = new MyThread();
//        child.start();
//        System.out.println("End " + mainThread.getName());

        //19:15

//        Thread.sleep(5000);
//        child.join();
//        System.out.println(child.getResult());

//        System.out.println("Start");
//        System.out.println("Hello from MyThread!!!");
//        System.out.println("End");


//        Thread thread = Thread.currentThread();
//        thread.setName("This is Main thread");
////       thread.setPriority(10);
////        System.out.println(thread.getPriority());//1-10
////        System.out.println(thread.isInterrupted());
////        System.out.println(thread.isAlive());
////        thread.join();
////        thread.run();
////        thread.start();
////        thread.sleep(10 * 1000);
//        System.out.println(thread.getName());


    }
}