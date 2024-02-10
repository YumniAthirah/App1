package lesson4.Q5POJOClass;

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

// A POJO (Plain Old Java Object) class in Java is a simple Java class that only contains private fields,
// along with public getter and setter methods to access and modify those fields. POJO classes are used
// to represent data objects in the application. They are appropriate when you need to model data with
// attributes but do not require any specific functionality or behavior beyond accessing and modifying
// those attributes.


// the entire application, such as logging, configuration settings, database connections, etc.

