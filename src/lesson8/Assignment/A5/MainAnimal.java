package lesson8.Assignment.A5;

public class MainAnimal {
    public static void main(String[] args) {

        //Dog
        Dog dog = new Dog("Alex", 4);
        dog.eat();
        dog.sleep();
        dog.makeSound();
        System.out.println();

        //Cat
        Cat cat = new Cat("Hitam", 3);
        cat.eat();
        cat.sleep();
        cat.makeSound();
        System.out.println();

        //Bird
        Bird bird = new Bird("Sara", 1);
        bird.eat();
        bird.sleep();
        bird.makeSound();
        System.out.println();
    }
}
