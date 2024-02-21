package Quiz.exam4;

interface Rideable {
    void ride(String name);
}

class Animal {
}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

public class Test13 {
    public static void main(String[] args) {
        Animal horse = new Horse();
        //[o]
        ((Horse)horse).ride("Emma");
        ((Rideable)horse).ride("emma");
        ((Rideable)(Horse)horse).ride("EMMA");
        ((Horse)(Rideable)horse).ride("emma");

        //[x]
        // horse.ride("EMMA");
        // (Horse)horse.ride("EMMA");
        // (Rideable)(Horse)horse.ride("EMMA");
        // (Rideable)horse.ride("emma");
        // (Horse)(Rideable)horse.ride("EMMA");
    }
}
