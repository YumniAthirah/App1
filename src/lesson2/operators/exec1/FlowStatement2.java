package lesson2.operators.exec1;
import java.util.Scanner;

public class FlowStatement2 {
    public static void main(String[] args) {
        int i, n, nFact;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        sc.close();

        nFact = 1;

        /* while(i<=n){
            nFact = nFact*i;
            i += 1;
        } */

        for(i = 1; i<=n; i++){
            nFact = nFact*i;
        }

        System.out.println("n! = " + nFact);
    }
}
