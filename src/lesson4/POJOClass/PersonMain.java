package lesson4.POJOClass;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        // Setting values will be done here
        person.setName("Marissa");
        person.setAge(24);
        person.setEmail("Marissa@gmail.com");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

    }
}
