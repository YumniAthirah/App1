package lesson3;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][] a = {{{1,2,3},{4,5},{6}},{{7,8},{9}}}; 

        System.out.println("a.length = " + a.length);                                          //print = a.length

        for (int i = 0; i < a.length; i++) {                                                   //i < a.length;
            System.out.printf("a[%d].length = %d\n", i, a[i].length);                   //print = a[i].length

            for (int j = 0; j < a[i].length; j++) {                                            //j < a[i].length;
                System.out.printf("a[%d][%d].length = %d\n", i, j, a[i][j].length);     //print = a[i][j].length

                for (int k = 0; k < a[i][j].length; k++) {                                     ////k < a[i][j].length;
                    System.out.printf("a[%d][%d][%d] = %d, ", i, j, k, a[i][j][k]);     //print = a[i][j][k]'s length
                }
                System.out.printf("\n");
            }
        }
    }

}
