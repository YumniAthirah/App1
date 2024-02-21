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
        // Variable 'horse' is of Animal type and ride(String) method is not defined in Animal class

        // (Horse)horse.ride("EMMA");
        // horse.ride("EMMA") will be evaluated first as dot (.) operator has higher precedence than cast. 
        // horse.ride("EMMA") returns void, hence it cannot be casted to Horse type

        // (Rideable)(Horse)horse.ride("EMMA");
        // horse.ride("EMMA") will be evaluated first as dot (.) operator has higher precedence than cast. 
        // horse.ride("EMMA") returns void, hence it cannot be casted to Rideable type

        // (Rideable)horse.ride("emma");
        // horse.ride("EMMA") will be evaluated first as dot (.) operator has higher precedence than cast. 
        // horse.ride("EMMA") returns void, hence it cannot be casted to Horse type

        // (Horse)(Rideable)horse.ride("EMMA");
        // horse.ride("EMMA") will be evaluated first as dot (.) operator has higher precedence than cast. 
        // horse.ride("EMMA") returns void, hence it cannot be casted to Rideable type.
    }
}
