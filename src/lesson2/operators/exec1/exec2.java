package lesson2.operators.exec1;
//distance between 3d space (pg 3)

public class exec2 {
    static double d, xoff, yoff, zoff;
    static int x1 = 2, y1 = 1, z1 = 3;
    static int x2 = 0, y2 = 0, z2 = 6;

    public static void main(String[] args) {
        xoff = Math.pow(x1 - x2, 2); 
        yoff = Math.pow(y1 - y2, 2);
        zoff = Math.pow(z1 - z2, 2);
        d = Math.sqrt(xoff + yoff + zoff);
        System.out.println(d);
    }
}
