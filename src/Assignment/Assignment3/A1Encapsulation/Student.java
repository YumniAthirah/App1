package Assignment.Assignment3.A1Encapsulation;

public class Student {
    private String name;
    private int age;
    private int rollNumber;

    public Student(){} // Default constructor

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
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
    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
}
