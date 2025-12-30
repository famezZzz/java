import java.util.ArrayList;
import java.util.List;

class Singleton{
    private static Singleton singleton;
    public static Singleton getSingleton(){
        if (singleton==null){
            singleton = new Singleton();
            System.out.println("Init data");
        }else{
            System.out.println("U nas uje est 1 ekzemplyar");
        }
        return singleton;
    }
    private List<String> list;
    public void addData(String str){
        list.add(str);
    }
    public List<String> getList() {
        return list;
    }
    private Singleton() {
        list = new ArrayList<>();
    }
}


public class Main {
    public static void main(String[] args) {

//        Singleton singleton = new Singleton();

        Singleton a1 = Singleton.getSingleton();
        Singleton a2 = Singleton.getSingleton();
        Singleton a3 = Singleton.getSingleton();
        Singleton a4 = Singleton.getSingleton();
        Singleton a5 = Singleton.getSingleton();

        a1.addData("Farid");
        a1.addData("Ilya");
        a2.addData("Viktor");
        a2.addData("Anton");
        a3.addData("Dawa");
        a3.addData("Mawa");
        a4.addData("Pawa");
        a5.addData("Sawa");
        a5.addData("Oleq");

        for (String name:a5.getList()) {
            System.out.println(name);
        }


//        Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();
//        Singleton singleton3 = new Singleton();
//        Singleton singleton4 = new Singleton();
//        Singleton singleton5 = new Singleton();
//        Singleton singleton6 = new Singleton();
    }
}