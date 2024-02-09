package lesson4.POJOClass;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {
        //TODO Auto-generated constructor stub
    }

    // Getter/setter methods will be added here
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}

/* public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "john@example.com");
        // Setting values will be done here
    }
}
 */