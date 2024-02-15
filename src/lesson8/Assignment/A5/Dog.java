package lesson8.Assignment.A5;

public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is barking");
    }
    
}
