package Assignment.Assignment3.A2Inheritance;

public class A2AnimalMain {
    public static void main(String[] args) {
        Animal cow = new Animal("Milly", "Moo");
        Dog dog = new Dog("Alex");

        System.out.print("Cow's name : ");
        cow.animalName();
        System.out.print("Sound : ");
        cow.makeSound();

        System.out.print("Dog's name : ");
        dog.animalName();
        System.out.print("Sound : ");
        dog.makeSound();
    }
}


