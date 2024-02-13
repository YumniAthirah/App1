package lesson4.quiz2.Test43;

class Point {
    static int x;       
    int y, z;

    //Point class correctly overrides the toString() method.
    //Even though variable x is static, but it can be easily accessed by instance method toString().    
    public String toString(){
        return "Point(" + x + "," + y + "," + z + ")";
    }
}

//static x : x is shared among all instances of the Point class. 
//Changing the value of x in one instance affects all other instances of the class.
