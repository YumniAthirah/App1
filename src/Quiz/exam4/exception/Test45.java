package Quiz.exam4.exception;

public class Test45 {
    public static void main(String[] args) {
        try {
            play();
            return;                                     //return statement
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;                                     //return statement
        } finally {
        System.out.println("MATCH ABANDONED");
        }
        //System.out.println("DONE");                   //unreachable bcoz both try and catch have return satement
    }

    static void play() throws Exception {
        throw new Exception("INJURED");
    }
}

// Both try and catch blocks have return; statement, 
// which means either of the return statements will definitely get executed. 
// Hence, compiler tags `System.out.println("DONE");` as unreachable and this causes compilation error.
