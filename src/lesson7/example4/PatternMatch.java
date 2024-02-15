package lesson7.example4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

    public void patternMatcher(){
        // Define the pattern you want to match
        String patternString = "Hello, (\\w+)! (\\w+)";     // The text expression "(\\w+)" will be used as
                                                            // capture group for the matcher
        Pattern pattern = Pattern.compile(patternString);

        //Input text to be matchwd
        String inputText = "Hello, Fara! How are you doing today?";

        //Create a Matcher object 
        Matcher matcher = pattern.matcher(inputText);

        //Check for matches 
        while(matcher.find()){
            //Print the matched group
            System.out.println("Match found: " + matcher.group(0));
            System.out.println("Capture group 1: " + matcher.group(1));
            System.out.println("Capture group 2: " + matcher.group(2));

        }
        
    }
}
