package lesson7.example4.SearchingWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import lesson7.example4.ReadFileHandler;

public class SearchWords extends ReadFileHandler {

    public SearchWords(String fileName) {
        super(fileName);
    }

    public void searchWords(Scanner sc) {
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getFilename()))) {
            System.out.print("Enter a keyword to search: ");
            String key = sc.nextLine();
            String line;
            boolean res = false;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                // Check if the search word exists in the current line
                for (String word : words) {
                    if (word.equals(key)) {
                        res = true; // Word found
                    }
                }
            }

            if (res) {
                System.out.println("Keyword Found!");
            } else {
                System.out.println("Keyword not found");
            }
        } catch (IOException e) {
            System.err.println(("Error in reading the file" + e.getMessage()));
        }
    }

}
