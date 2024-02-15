package lesson7.example4.CopyingFile;

import java.util.Scanner;

public class MainFileCopying {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the file to copy from: ");
        String sourceFileName1 = sc.nextLine();
        System.out.print("Enter name of the file to copy to: ");
        String targetFileName1 = sc.nextLine();

        CopyFile copy = new CopyFile(sourceFileName1, targetFileName1);
        copy.copyFile();  // Call the method directly
        System.out.println("Successfully copied content from " + sourceFileName1 + " to " + targetFileName1 + ".");
        sc.close();
        // End copying files
    }

}
