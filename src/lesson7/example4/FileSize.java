package lesson7.example4;

import java.io.File;

public class FileSize extends ReadFileHandler{

    public FileSize(String fileName) {
        super(fileName);
    }

    public void fileSize(){
        File file = new File(super.getFilename());

        if(file.exists()){
            System.out.println("File length: " + file.length());
        } else {
            System.out.println("File detection failed");
        }
    }
    
    
}
