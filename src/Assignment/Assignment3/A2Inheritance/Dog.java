package Assignment.Assignment3.A2Inheritance;

public class Dog extends Animal{

    public Dog(String name){
        super(name, "Bark");
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
