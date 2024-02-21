package Quiz.exam4;

class Base{
    int id = 1000;                  //Line n1

    Base(){
        Base();
    }

    void Base(){                    //Line n3
        System.out.println(++id);   //Line n4
    }
}

class Derived extends Base{
    int id = 2000;                  //Line n5

    Derived() {}                    //Line n6

    void Base(){                    //Line n7
        System.out.println(--id);   //Line n8
    }
}
public class Test27 {
    public static void main(String[] args) {
        Base base = new Derived();  //Line n9
        //new Derived() at Line n9 invokes the constructor of Derived class, 
        //at this point instance variable id is declared and 0 is assigned to it.
    }
}
