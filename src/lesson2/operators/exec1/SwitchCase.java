package lesson2.operators.exec1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day abbr: ");
        String str = sc.nextLine();
        sc.close();
    }

    /* static String switchCase(String day) {
        String ret = "";
        switch (day) {
            case "m":
                ret = "Monday";
                break;
            case "tu":
                ret = "Tuesday";
                break;
            case "w":
                ret = "Wednesday";
                break;
            default:
                ret = "Undefined";
                break;
        }

    } */
}
