package Quiz.exam4.exception;

public class Test45 {
    public static void main(String[] args) {
        try {
            play();
            return;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        } finally {
        System.out.println("MATCH ABANDONED");
        }
        //System.out.println("DONE");   //unreachable
    }

    static void play() throws Exception {
        throw new Exception("INJURED");
    }
}
