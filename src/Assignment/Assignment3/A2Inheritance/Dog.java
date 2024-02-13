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

//super(name, "Bark") call in the Dog constructor is to make sure 
//that the superclass Animal is properly initialized with the name and sound of the dog
