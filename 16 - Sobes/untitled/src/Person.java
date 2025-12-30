//class CountingHashSet<E> extends HashSet<E> {
//    private int addCount = 0;
//
//    public CountingHashSet() {
//    }
//    @Override
//    public boolean add(E e) {
//        addCount++;
//        return super.add(e);
//    }
//    @Override
//    public boolean addAll(Collection<? extends E> c) {
//        addCount+= c.size();
//        return super.addAll(c);
//    }
//    public int getAddCount() {
//        return addCount;
//    }
//}

//
//class A{
//    public String name = "A";
//
//    public void print(){
//        System.out.println("A");
//    }
//}
//
//class B extends A{
//    public String name = "B";
//
//    @Override
//    public void print(){
//        System.out.println("B");
//    }
//}

//
//class A{
//
//    private void test(){
//        System.out.println("A");
//    }
//    public void run(){
//        test();
//    }
//}
//class B extends A{
//
//    private void test(){
//        System.out.println("B");
//    }
//}
//
//class A{
//    A get() {
//        return this;
//    }
//}
//
//class B extends A{
//
//    B get() {
//        return this;
//    }
//}

//
//class A {
//    static void print(){
//        System.out.println("A one");
//    }
//}
//
//class B extends A {
//    static void print(){
//        System.out.println("B one");
//    }
//}


//interface X{
//    default void run(){
//        System.out.println("X");
//    };
//}
//
//
//interface Y{
//    default void run(){
//        System.out.println("Y");
//    };
//}
//
//class A implements X , Y{
//
//    @Override
//    public void run() {
//        Y.super.run();
//    }
//}
//
//class Test{
//    public Test() {
//        System.out.println("Test 1");
//    }
//    public Test(String s) {
//        this();
//        System.out.println("Test 2");
//    }
//    public Test(String s,String b) {
//        this( b);
//        System.out.println("Test 3");
//    }
//}
//
//
//c
//
//public class Person{
//    public static void main(String[] args){
//
//    }
//}

class Test {
    protected String name;
}

//
//private class Secret{
//
//}
//final class Farid{
//
//}
//
//class B extends Farid{
//
//}

//
//class A{
//    final void test(){
//
//    }
//}
//
//
//class B extends A{
//    void test(){
//
//    }
//}

//
//class A {
//    static String name;
//    public A() {
//        System.out.println("constructor called");
//    }
//    static {
//        System.out.println("Static called");
//    }
//
//    {
//        System.out.println("called");
//    }
//}

class Main {
//    class Test{
//        public void test(){
//
//        }
//    }

//    private class Test{
//
//    }

//     public static int test(){//result = 3
//         try {
//             System.out.println(10/0);
//         }catch(Exception e){
//             throw  new Exception();
//         }finally {
//             System.out.println("Farid");
//             return 3;
//         }
//     }

    public static void main(String[] args) {

        //10:18

//        A a = null;
//        A a = new A();
//        A a1 = new A();
//        A a2 = new A();
//        A a3 = new A();
//        A a4 = new A();
        // called
        // static called
        // constructor called






//        for (int i = 0; i < 3; i++) {
//            try {
//                System.out.println("try");
//               continue;
//            }catch(Exception e){
//                System.out.println("catch");
//                continue;
//            }finally {
//                System.out.println("finally");
//                continue;
//            }
//        }


//        System.out.println(test());
        //1
        //1?3


//        class LocalClass{
//
//        }

//        Test t = new Test();
//        t.name = "Farid";

//Test test = new Test("f","f");


//        A a = new B();
//        a.print();


//        A a = new B();
//        A x = a.get(); // ? B  A
//        B b = ( (B) a ).get(); // ? B B


//        A obj = new B();
//        obj.run(); //?


//        A obj = new B();
//        System.out.println(obj.name);//A
//        obj.print();//B

        //1 B B
        //2 A B


//        CountingHashSet<String> set = new CountingHashSet<>();
//        set.addAll(Arrays.asList("a", "b", "c"));
//        System.out.println(set.size());//3
    }
}