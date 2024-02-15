package lesson7.example4.CopyingFile;

public abstract class CopyFileHandler {
    private String sourceFileName;
    private String targetFileName;

    public CopyFileHandler(String sourceFileName, String targetFileName){
        this.sourceFileName= sourceFileName;
        this.targetFileName= targetFileName;
    }

    public String getsourceFileName(){
        return sourceFileName;
    }

    public void setsourceFileName(String sourceFileName){
        this.sourceFileName = sourceFileName;
    }

    public String gettargetFileName(){
        return targetFileName;
    }

    public void settargetFileName(String targetFileName){
        this.targetFileName = targetFileName;
    }
}
