package Assignment.Assignment3.A1Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        // Setting values will be done here
        student.setName("Marissa");
        student.setAge(16);
        student.setRollNumber(20567);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("RollNumber: " + student.getRollNumber());

    }
}

