package lesson7.example4;

public abstract class ReadFileHandler {
    private String filename;

    public ReadFileHandler(String fileName){
        this.filename = fileName;
    }

    public String getFilename(){
        return filename;
    }

    public void setFilename(String filename){
        this.filename = filename;
    }
}
