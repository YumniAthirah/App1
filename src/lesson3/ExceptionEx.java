package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx {
    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        try {
            String firstName;
            String lastName;

            System.out.print("Enter first name:");
            firstName = stdin.readLine();
            System.out.print("Enter last name:");
            lastName = stdin.readLine();

            System.out.println("Hi " + firstName + " " + lastName);


        } catch (NumberFormatException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
