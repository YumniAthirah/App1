package lesson7.example4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile extends ReadFileHandler{
    
    public AppendFile(String fileName) {
        super(fileName);
    }

    public void appendFile(){
        try {
             
        //initialized scanner and writer
        Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter(super.getFilename(), true));

        //Ask for text that want to be append to file
        System.out.println("Please enter the text: ");
        writer.write(sc.nextLine());
        writer.newLine();       //line seperator

        //Close all object
        writer.close();
        sc.close();
        System.out.println("The file were appended");
            
        } catch (IOException e) {
            System.err.println(("Error in reading the file" + e.getMessage()));
        }
             
    }

}
