import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


@FunctionalInterface
interface Filtrable {
    boolean check(int num);
//    boolean check(int x,int z);
}


class Person{
    private byte age;//0-100
    private String name;
    private String surname;

    public short getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


public class Main {

    //protected
    //public
    //private
    //default


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrCet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrNeCet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrMoreThen(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrDel2or3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrLesThen(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }


    public static void printArrFull(int[] arr, Filtrable filtrable) {
        for (int i = 0; i < arr.length; i++) {
            if (filtrable.check(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }


    public static int[] merge(int[] one,int[] two){
        return null;
    }

    public static void main(String[] args) {

        //IF FOR ARR

//     Есть 2 массива в отсортированнов виде
//
     int[] arr = {-5,0,1,1,2,3,6,8,22,45,678};
     int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100};
//
        int[] arr3 = merge(arr,arr2); //{ -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
//
//     Нельзя использовать сортировку



















//        Filtrable filtrable = (x,y)->true;
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        printArr(arr);
//        printArrCet(arr);
//        printArrNeCet(arr);
//        printArrMoreThen(arr, 5);
//        printArrLesThen(arr, 5);
//        printArrDel2or3(arr);
//
//        System.out.println();
//
//        printArrFull(arr,x->true);
//        printArrFull(arr,x->x % 2 == 0);
//        printArrFull(arr,x->x % 2 != 0);
//        printArrFull(arr,x->x > 5);
//        printArrFull(arr,x->x < 5);
//        printArrFull(arr,x->x % 2 == 0 && x % 3 == 0);
//        printArrFull(arr,x->x % 3 == 0 || x % 7 == 0);

//        HashMap<String,Integer> hashMap = new HashMap<>();
//        hashMap.put("A",1);
//        hashMap.put("B",2);
//        hashMap.put("C",3);
//        hashMap.put("D",4);
//        hashMap.put("Z",5);

//        hashMap.entrySet().removeIf(x->x.getValue()==2);
//        hashMap.values().removeIf(value->value==2);


//        String key = null;
//        int removed = 5;
//
//        for (Map.Entry<String,Integer> entry: hashMap.entrySet() ) {
//            if (entry.getValue()==removed){
//                key = entry.getKey();
//                hashMap.remove(key);
//                break;
//            }
//        }

//        if (key!=null){
//            hashMap.remove(key);
//        }

//        System.out.println(hashMap);

//        TreeMap<String,String> treeMap = new TreeMap<>();
//        treeMap.put("AAnna","Abdullayev");
//        treeMap.put("Farid","Abdullayev");
//        treeMap.put("Dima","Bilan");
//        treeMap.put("Oleq","Qazmanov");
//        treeMap.put("Anna","Abdullayev");
//
//        TreeMap<String,String> treeMap2 = new TreeMap<>();
//        treeMap2.put("1","Abdullayev");
//        treeMap2.put("2","Abdullayev");
//        treeMap2.put("3","Bilan");
//        treeMap2.put("4","Qazmanov");
//        treeMap2.put("5","Abdullayev");
//
//        treeMap.pollFirstEntry();
//        treeMap.pollLastEntry();
//
//
//        treeMap.firstEntry();
//        treeMap.lastEntry();
//
//        treeMap.firstKey();
//        treeMap.lastKey();
//
//        treeMap.size();
//        treeMap.isEmpty();
//        treeMap.containsKey("s");
//        treeMap.containsValue("s");
//        treeMap.get("K");
//        treeMap.remove("K");
//
//        treeMap.putAll(treeMap2);
//
//        System.out.println(treeMap);



        //Outer class
        //Nested class
        //Static Nested class
        //Inner class
        //Local class
        //Record class
        //Anonym class
        //Sealed class
//
//        OuterClass.StaticNestedClass nestedClass
//                = new OuterClass.StaticNestedClass();
//
////        OuterClass.InnerClass innerClass = new OuterClass().InnerClass();
//       OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.createInstance();


//        boolean admin = true;
//        if (admin){
//            class EmailSender implements MessageSender{
//                @Override
//                public void send(String messages) {
//                    System.out.println("Sending email: " + messages);
//                }
//            }
//            MessageSender messageSender = new EmailSender();
//            messageSender.send("Okey");
//        }


//        MessageSender messageSender = new MessageSender() {
//            @Override
//            public void send(String messages) {
//                System.out.println("Sending email: " + messages);
//            }
//        };
//
//
//        messageSender.send("Okey");


//        Test test = new Test() {
//            @Override
//            void send(String messages) {
//                System.out.println("Sending email: " + messages);
//            }
//        };
//
//        test.send("Okey");

//        MessageSender messageSender = str -> System.out.println(str);
//
//
//        messageSender.send("Dawa");

//        Test test = (x,y) -> x+y; ;
//
//        System.out.println(test.sum(10,20));


        //35


    }
}
//interface Test{
//    int sum(int a , int b);
//}

//abstract class Test{
//    abstract void send(String messages);
//
//}
//interface MessageSender{
//    void send(String messages);
//}
//
////Outer
//class OuterClass{
//    //Inner class
//
//    public void test(){
//        class LocalClass{
//            public int a;
//            private int b;
//            protected int c;
//            static int d;
//        }
//    }
//   public int a;
//   private int b;
//   protected int c;
//   static int d;
//   int e;
//    class InnerClass{
//
//        public InnerClass() {
//            a = 1;
//            d = 1;
//            e = 1;
//            b = 1;
//            c = 1;
//        }
//    }
//
//    public InnerClass createInstance(){
//        return new InnerClass();
//    }
//    //Inner class
//    static class StaticNestedClass{
//        public StaticNestedClass() {
//            d = 1;
//        }
//    }
//}
//
//

// Ощибка компиляции (Compile-time errors)
// Runtime errors (Ошибка выполнения)

//errors
//public class Farid{
//
//}




































































































































