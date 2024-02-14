package lesson7.example4.JsonFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import lesson7.example4.ReadFileHandler;

public class ReadJson extends ReadFileHandler{

    public ReadJson(String fileName) {
        super(fileName);
    }

    public Person readJsonFile(String filename) {
        try {
            //Files.readAllBytes() = reads all bytes from a file into a byte array.
            String content = new String(Files.readAllBytes(Paths.get(filename)));
            
            //remove any leading and trailing whitespace characters    
            content = content.trim();

            //indicators of a JSON object
            if (!content.startsWith("{") || !content.endsWith("}")) {
                throw new IllegalArgumentException("Invalid JSON format");
            }

            //removes the first and last characters from the content string, which are { and } 
            content = content.substring(1, content.length() - 1);

            //splits the content string into an array of key-value pairs based on the comma ","
            //Pair 1 = "name" : "Yumni"
            //Pair 2 = "age" : 21 
            String[] keyValuePairs = content.split(",");

            //initialize name and age
            String name = null;
            int age = 0;

            //iterates over each key-value pair in the keyValuePairs array.
            for (String pair : keyValuePairs) {

                //splits into key and value
                String[] keyValue = pair.split(":");

                //trim() = removes any leading or trailing whitespace
                //replace = remove the double quote ("")
                String key = keyValue[0].trim().replace("\"", "");
                String value = keyValue[1].trim().replace("\"", "");
                
                //find the name field in the JSON object.
                if (key.equals("name")) {
                    //the corresponding value is assigned to the name variable.
                    name = value;

                //find the age field in the JSON object.
                } else if (key.equals("age")) {
                    //the corresponding value is assigned to the age variable.
                    //Integer.parseInt() = converts a String into an int primitive type.
                    age = Integer.parseInt(value);
                }
            }

            //creates a new Person object with the extracted name and age values, and returns it.
            if (name != null) {
                return new Person(name, age);
            }
        } catch (IOException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
