public class Main {
    public static void main(String[] args) {
//          int a = 5;
//          (6) a = 5;
//          System.out.println(a);

//          1       a = 5
//          2       a = 5 (6)
//          3   (6) a = 5 (6)
//          4       a = 5


//        int a = 1;//2//3
//        System.out.println(a++ - ++a);  -2
//        System.out.println(1 - 3);  -2


/// ///////////////////////////////////////////////////////////////////

//        int a = 20;
//        boolean b = true;
//
//        if (!!!b && ++a > 20){
//           System.out.println("ok");
//        }
//
//        System.out.println(a);
//        System.out.println(b);
/// ///////////////////////////////////////////////////////////////////

//        int a = 20;
//        boolean b = false;
//
//        if (!b || ++a > 20){
//           System.out.println("ok");
//        }
//
//        System.out.println(a);
//        System.out.println(b);


/// /////////////////////////////////////////////////////////////////////

//        1) Есть 2 массива в отсортированнов виде
//
//        int[] arr = {-5,0,1,1,2,3,6,8,22,45,678}
//        int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100}
//
//        int[] arr3 = { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}
//
//        Нельзя использовать сортировку
//
//        int[] arr = {-5,0,1,1,2,3,6,8,22,45,678};
//        int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100};
//
//        int[] arr3 = twoArr(arr,arr2);
//
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + " ");
//        }



//        Пользователь вводит число (1 - 3999)
//        I - 1
//        V - 5
//        X - 10
//        L - 50
//        C - 100
//        D - 500
//        M - 1000
//        Пример  10 -> x
//        6 -> VI





    }

    public static String toRoman(int num) {
        String str = "";

        return str;
    }


//    public static int[] twoArr(int[] arr1, int[] arr2) {
//        int[] arr3 = new int[arr1.length + arr2.length];
//        for (int i = 0,oneIndex = 0 , twoIndex = 0; i < arr3.length; i++) {
//            //arr1[oneIndex]<arr2[twoIndex]
//            //twoIndex ==  arr2.length
//            //oneIndex <  arr1.length
//
//            //1  (oneIndex <  arr1.length)                                  (twoIndex ==  arr2.length || arr1[oneIndex]<arr2[twoIndex])
//            //2  (oneIndex <  arr1.length &&  twoIndex ==  arr2.length)     (arr1[oneIndex]<arr2[twoIndex])
//            if(oneIndex <  arr1.length &&  (twoIndex == arr2.length || arr1[oneIndex]<arr2[twoIndex])){
//                //oneIndex <  arr1.length(true)    && twoIndex ==  arr2.length(true)
//                //oneIndex <  arr1.length(true)    && twoIndex ==  arr2.length(false) && arr1[oneIndex]<arr2[twoIndex](true)
//                arr3[i] = arr1[oneIndex++];
//            }else{
//                //oneIndex <  arr1.length => (false)
//                //oneIndex <  arr1.length(true) && twoIndex ==  arr2.length(false) && arr1[oneIndex]<arr2[twoIndex](false)
//                arr3[i] = arr2[twoIndex++];
//            }
//            //1)  < ==
//            //2)  &&
//            //3)  ||
//        }
//
//        return arr3;
//    }
}