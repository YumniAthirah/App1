package lesson7.example4.JsonFile;

public class MainJson {
    static String filename = "example4.txt";
    static String jsonfilename = "file.json";

    public static void main(String[] args) {
        //Read json file
        ReadJson readJson = new ReadJson(jsonfilename);
        Person person = readJson.readJsonFile(jsonfilename);
        if (person != null) {
            System.out.println(person);
        }
        
    }
}