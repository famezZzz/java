import java.util.*;

class Person {
    String name;
    String surname;
    String passport;
    String email;

    public Person(String name, String surname, String passport, String email) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + passport + " " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}

public class Main {
    public static void main(String[] args) {


        //*
//        HashMap<String, List<String>> dictionary = new HashMap<>();
//        dictionary.put("dog",List.of("sobaka"));
//        dictionary.put("brother", List.of("brat"));
//        dictionary.put("mother", List.of("mama","mat"));
//        dictionary.put("father", List.of("otec","papa"));
//        dictionary.put("home", List.of("dom"));

//        HashMap<String, String> dictionary = new HashMap<>();
//        dictionary.put("dog", "sobaka");
//        dictionary.put("brother", "brat");
//        dictionary.put("mother", "mama");
//        dictionary.put("father", "otec");
//        dictionary.put("home", "dom");
//
//
//        do {
//            System.out.print("Vvedite slovo : ");
//            Scanner scanner = new Scanner(System.in);
//            String word = scanner.nextLine();
//            word = word.toLowerCase();
//
//            if (dictionary.containsKey(word)) {
//                System.out.println(word + " (en) => " + dictionary.get(word) + " (ru)");
//            } else if (dictionary.containsValue(word)) {
//                for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//                    if (entry.getValue().equals(word)) {
//                        System.out.println(entry.getKey() + " (en) => " + entry.getValue() + " (ru)");
//                        break;
//                    }
//                }
//            } else {
//                System.out.print("Dannoe slovo otsutsvuet,Ne xotite li vi eqo dobavit\n1 - Da\n2 - Net\n");
//                scanner = new Scanner(System.in);
//                int select  = scanner.nextInt();
//
//                if (select==1){
//                    System.out.print("Vvedite perevod dannoqo slova : ");
//                    scanner = new Scanner(System.in);
//                    String  newWord  = scanner.nextLine();
//
//                    newWord = newWord.toLowerCase();
//
//                    dictionary.put(newWord,word);
//                }
//            }
//
//
//        } while (true);


        //////////////////////////////////////////


//        Person person1 = new Person("Farid", "Abdullayev", "12345");
//        Person person2 = new Person("Farid", "Abdullayev", "12345");
//
////        System.out.println(person1.equals(person2));
//        System.out.println(person1==person2);


//        for (int i = 0; i < 10; i++) {
//            Person person = new Person("Farid", "Abdullayev", "12345");
//            System.out.println(person.hashCode());
//        }
//        HashMap<Person,String> map = new HashMap<>();
//        map.put(new Person("Farid","Abdullayev","12345","fabdullayev902@gmail.com"),"+994519999902");
//        map.put(new Person("Farid","Abdullayev","12345","fabdullayev902@gmail.com"),"+994519999902");
//        map.put(new Person("Farid","Abdullayev","12345","fabdullayev902@gmail.com"),"+994519999902");
//        map.put(new Person("Farid","Abdullayev","12345","fabdullayev902@gmail.com"),"+994519999902");
//        map.put(new Person("Farid","Abdullayev","12345","fabdullayev902@gmail.com"),"+994519999902");
//        map.put(new Person("Farid","Abdullayev","12345","fabdullayev@mail.ru"),"+994519999902");
//        map.put(new Person("Dima","Cerkasov","12345","dimon@mail.ru"),"+723456787654");
//        map.put(new Person("Dima","Cerkasov","00000","dimon@mail.ru"),"+723456787654");
//        map.put(new Person("Oleq","Qazmanov","9999","oleq@bk.ru"),"+7123456789876");
//
//
//        for (Map.Entry<Person,String> entry:map.entrySet() ) {
//            System.out.println(entry.getKey() + " : "+entry.getValue());
//        }


        ///////////////////////////////////////////////////////////


        // ++ --
//         int a = 1;//2 3
//
//
//         //                1   -   3
//        System.out.println(a++ - ++a);
//
//        //-2  +
//        //-1
//        // 1
//        // 0


        // IF

//        if (true)
//            System.out.println("da");
//            System.out.println("da");
//            //da
//        else
//            System.out.println("net");
//            //net


//        if (true){
//
//        }
//
//        if (true){
//
//        }
//
//        if (true){
//
//        }
        //////////////

//        if (true) {
//
//        } else if (true) {
//
//        } else if (true) {
//
//        }


//        int a = 10;
//        boolean b = true;
//
//        if (!!b && ++a > 10){
//            System.out.println("Da");
//        }else{
//            System.out.println("Net");
//        }
//
//        System.out.println("a => " + a);
//        System.out.println("b => " + b);


        //da 11 true
        //da 10 true


        /////////////////////////////////////////////////


        //
        //int[] arr;
        //int[] arr = new arr[10]  //0-9
        //int[] arr2 = new arr[arr.lenght+1]  //0-9


        //500
        //501

        //           0  1  2   3  4  5 6  7  8
//        int[] arr = {11,22,33,44,55,66,77,88,99};

        //-2147xxx xxx +2147 xxx xxx

//        System.out.println(arr[3]);


        //Collections
        //+ dinamiceskiy razmer
        //+ vstroyennie funkcii


//        System.out.println("");


        //

//        arr = new int[];
        //clear();

        //capacity


        //int ,

        //HashMap Java Collections Framework (JCF)

//        HashMap<String,Integer> map  = new HashMap<>();
//        map.put("Farid",29);
//        map.put("Dima",34);
//        map.put("Dawa",20);
//        map.put("Oleq",10);

//        Set<String> keySet = map.keySet();
//        Collection<Integer> values = map.values();

        //map.keySet().var
//        var keySet = map.keySet();
//        var values = map.values();
//
//
//        Set<String> set = map.keySet();
//        int a = 10;
//        var z = 10;
//        z = "Farid";


//        map.clear();
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());

//        if (map.containsKey("Farid1")){
//            System.out.println("Est");
//        }else{
//            System.out.println("Netu");
//        }

//        if (map.containsValue(29)){
//            System.out.println("Est");
//        }else{
//            System.out.println("Netu");
//        }


//        Integer removed = map.remove("Farid1");
//        System.out.println(removed + " bil udalen");

//        System.out.println(map.get("Farid1"));

//        for (Map.Entry<String,Integer> entry:map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }


        // type                  struktura                 poryadok           nalicie na null
        //HashMap                 xes-table               neuporyadocen             1
        //LinkedHasMap          xes-table-linkedlista     poryado vstavki           1
        //TreeMap           krasnoe=cernoe derevo         poryadok sortirovki     not null
        //HashTable               xes-table                 neuporyadocen         not null


    }
}