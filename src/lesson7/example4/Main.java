package lesson7.example4;

import java.util.Scanner;


public class Main {
    static String filename = "example4.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Read file & print the file
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();
        // Count words
        CountWords countWords = new CountWords(filename);
        int count = countWords.countWords();
        System.out.println("Length of words: " + count);
        // Write file
        WriteFile writeFile = new WriteFile(filename);
        writeFile.write("Write some text \n Write some more text\n");
        readFile.printFile();
        // Append file
        AppendFile appendingFile = new AppendFile(filename);
        appendingFile.appendFile();
        readFile.printFile();
        // Get file size
        FileSize fileSize =  new FileSize(filename);
        fileSize.fileSize();
        //Pattern Matching
        PatternMatch patternMatch = new PatternMatch();
        patternMatch.patternMatcher();
    }
}
