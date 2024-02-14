package lesson7.example4;

public class Main {
    static String filename = "example4.txt";
    static String jsonfilename = "file.json";

    public static void main(String[] args) {
        // Readfile & print the file
        ReadFile readFile = new ReadFile(filename);
        readFile.printFile();
        // Count words
        CountWords countWords = new CountWords(filename);
        int count = countWords.countWords();
        System.out.println("Length of words: " + count);

        
    }
}
