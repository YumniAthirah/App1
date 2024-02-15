package lesson8.Assignment.A5AnimalHierarchy;

public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is chirping");
    }
    
    
}
