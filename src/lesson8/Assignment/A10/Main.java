package lesson8.Assignment.A10;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt"; 
        String zipOutputFile = "output.zip"; 
        String gzipOutputFile = "output.gz";
        String lzmaOutputFile = "output.lzma";

        // Test ZIP compression
        ZipAlgorithm zipAlgorithm = new ZipAlgorithm();
        zipAlgorithm.compress(inputFile, zipOutputFile);

        // Test GZip compression
        GZipAlgorithm gzipAlgorithm = new GZipAlgorithm();
        gzipAlgorithm.compress(inputFile, gzipOutputFile);

        // Test LZMA compression
        LZMAAlgorithm lzmaAlgorithm = new LZMAAlgorithm();
        lzmaAlgorithm.compress(inputFile, lzmaOutputFile);
    }
}
