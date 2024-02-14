package lesson4.quiz2.Test43;

public class Test43 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 35;
        p1.z = -1;
        //System.out.println(p1);       //Point(17,35,-1)

        Point p2 = new Point();
        p2.x = 19;
        p2.y = 40;
        p2.z = 0;

        /* Point p3 = new Point();
        p3.x = 1;
        p3.y = 2;
        p3.z = 3; */

        System.out.println(p1);
        System.out.println(p2);
        //System.out.println(p3);
    }
}

/*
 * p1.x = 17; sets the value of static variable x to 17, p2.x = 19;
 * modifies the value of static variable x to 19.
 * As there is just one copy of x, hence p1.x = 19
 */

/*
 * Note: p1.x and p2.x don't cause any compilation error but as this syntax
 * creates confusion,
 * so it is not a good practice to access the static variables or static
 * methods using reference variable, instead class name should be used. 
 * Point.x is the preferred syntax.
 */
