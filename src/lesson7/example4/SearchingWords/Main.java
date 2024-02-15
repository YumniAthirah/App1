package lesson7.example4.SearchingWords;

import java.util.Scanner;

public class Main {
    static String filename = "example4.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SearchWords searchWord = new SearchWords(filename);
        searchWord.searchWords(sc);
    }
}
