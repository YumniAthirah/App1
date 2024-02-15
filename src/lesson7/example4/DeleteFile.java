package lesson7.example4;

import java.io.File;

public class DeleteFile extends ReadFileHandler{

    public DeleteFile(String fileName) {
        super(fileName);
    }

    public void deleteFile(){
        File file = new File(super.getFilename());
        if(file.delete()){
            System.out.println("The file is successfully deleted");
        } else {
            System.out.println("File detection failed");
        }
    }
    
}
