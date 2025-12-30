
class Person implements Cloneable{
    private int age;
    private String name;

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
//        return clone;
    }

    private int id;

    public Person(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //    public Person copy(){
//        Person person = new Person(this.age,this.name,this.id);
//        return person;
//    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

//       Person person1 = new Person(29,"Farid",1);
//       Person person2 = person1.clone();
//
//
//        System.out.println(person2);
//        System.out.println(person1);

        //////////////////////////////////////////////////////////

//        Person person1 = new Person(29,"Farid",1);
//       Person person2 = new Person(person1.getAge(),person1.getName(), person1.getId());
//
//       person1.setName("Oleq");
//        System.out.println(person2);
//        System.out.println(person1);

//        System.out.println(person1 == person2);
    }
}