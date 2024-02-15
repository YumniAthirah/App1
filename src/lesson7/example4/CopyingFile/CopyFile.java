package lesson7.example4.CopyingFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile extends CopyFileHandler {

    public CopyFile(String sourceFileName, String targetFileName) {
        super(sourceFileName, targetFileName);
    }

    public void copyFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getsourceFileName()));
                FileWriter writer = new FileWriter(super.gettargetFileName())) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            System.err.println(("Error in reading the file" + e.getMessage()));
        }
    }
}
