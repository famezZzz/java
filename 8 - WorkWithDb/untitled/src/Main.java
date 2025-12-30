import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


class Person {
   private int id;
   private String name;
   private String surname;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    public static List<Person> getPersons() {

        List<Person> persons = new ArrayList<>();
//        persons.add(new Person(1, "John", "Doe"));

        try {
            String url = "jdbc:mysql://localhost:3306/Java521";
            String username = "root";
            String password = "root";


//            String sqlQuery = "SELECT id,name,surname FROM Persons";
            String sqlQuery = "SELECT * FROM Persons";

            try (Connection connection = DriverManager.getConnection(url,username,password)){
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sqlQuery);


                if (resultSet.wasNull()){

                    while (resultSet.next()) {
//                   System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2) + " " + resultSet.getString(3));
//                        System.out.println(resultSet.getInt("id")+ " " + resultSet.getString("name") + " " + resultSet.getString("surname"));
                       persons.add(new Person(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("surname")));
                    }
                }


            }
        }catch (Exception e){
            System.out.println("Bad connect");
        }

        return persons;
    }


    public static void insertPerson(Person person) {
        try {
            String url = "jdbc:mysql://localhost:3306/Java521";
            String username = "root";
            String password = "root";

            try (Connection connection = DriverManager.getConnection(url,username,password)){

                String sqlQuery = "INSERT INTO Persons (Id,Name, Surname) VALUES  (?,?,?)";

                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)){
                    preparedStatement.setInt(1, person.getId());
                    preparedStatement.setString(2, person.getName());
                    preparedStatement.setString(3, person.getSurname());

                    preparedStatement.executeUpdate();
                }
            }

//
        }catch (Exception e){
            System.out.println("Bad connect " + e.getMessage());
        }
    }

    public static void main(String[] args) {


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//        List<Person> persons = getPersons();
//        int index = 1;
//        for (Person person : persons) {
//            System.out.println(index++ + ") " + person);
//        }



        //JDBC (Java Database Connect)


        //Connect
        //Send SQL
        //Recieve Result



        //Konnector  -> Eto lib  , (.jar)


//        try {
////            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//               Statement statement = connection.createStatement();
//
//
////                statement.executeUpdate()     =>    DROP , CREATE , INSERT , DELETE , UPDATE
////                statement.executeQuery()      =>    SELECT (ResultSet)
////                statement.execute()           =>    Boolean
//
//
//                System.out.println("Good connect");
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }

/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        try {
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
//            String sqlQuery = "CREATE TABLE Persons( Id INT,  Name NVARCHAR(50), Surname NVARCHAR(50))";
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//                Statement statement = connection.createStatement();
//                int createRows = statement.executeUpdate(sqlQuery);
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        try {
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
//            String sqlQuery = "INSERT INTO Persons (Id,Name, Surname) VALUES " +
//                    "(1,'Farid','Abdullayeva')," +
//                    "(2,'Oleq','Qazmanova')," +
//                    "(3,'Sawa','Ivanov')," +
//                    "(3,'Sawa','Ivanonava')," +
//                    "(4,'Dima','Bilan')";
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//                Statement statement = connection.createStatement();
//                int createRows = statement.executeUpdate(sqlQuery);
//                System.out.println("Create Rows: " + createRows);
//            }
//
////
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }



        /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//        try {
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
//            String sqlQuery = "UPDATE Persons SET Name = '999' WHERE id > 3";
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//                Statement statement = connection.createStatement();
//                int createRows = statement.executeUpdate(sqlQuery);
//                System.out.println("Update Rows: " + createRows);
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }





//        /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//        try {
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
//            String sqlQuery = "DELETE FROM Persons WHERE id > 3";
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//                Statement statement = connection.createStatement();
//                int deleteRows = statement.executeUpdate(sqlQuery);
//                System.out.println("Deleted Rows: " + deleteRows);
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }


//        /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//        try {
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
//            String sqlQuery = "DROP TABLE Persons";
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//                Statement statement = connection.createStatement();
//                int dropTable = statement.executeUpdate(sqlQuery);
//                System.out.println("Drop Table : " + dropTable);
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }




        /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//
//        try {
//            String url = "jdbc:mysql://localhost:3306/Java521";
//            String username = "root";
//            String password = "root";
//
//
////            String sqlQuery = "SELECT id,name,surname FROM Persons";
//            String sqlQuery = "SELECT * FROM Persons";
//
//            try (Connection connection = DriverManager.getConnection(url,username,password)){
//                Statement statement = connection.createStatement();
//               ResultSet resultSet = statement.executeQuery(sqlQuery);
//
//
//               while (resultSet.next()) {
////                   System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2) + " " + resultSet.getString(3));
//                   System.out.println(resultSet.getInt("id")+ " " + resultSet.getString("name") + " " + resultSet.getString("surname"));
//               }
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Bad connect");
//        }

//        insertPerson(new Person(999,"9999","aaa');DROP TABLE Persons;#"));



        /// //////////////////////////////////////////////////////////////////////////////////
        //CRUD

        //S


    }
}