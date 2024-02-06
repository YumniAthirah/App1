package Assingment1;

public class Assingment1 {
    public static void main(String[] args) {
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean boolValue = true;
        char charValue = 'A';
        String stringValue = "Hello, World!"; 

        String sintegerNumber = String.valueOf(integerNumber);
        String sdoubleNumber = String.valueOf(doubleNumber);
        String sboolValue = String.valueOf(boolValue);
        String scharValue = String.valueOf(charValue);

        System.out.println("Strings:");
        System.out.println(sintegerNumber + " " + sdoubleNumber + " " + sboolValue + " "
        + scharValue + " " + stringValue);
        
    }       
}



