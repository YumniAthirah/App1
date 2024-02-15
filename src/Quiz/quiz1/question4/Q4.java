package Quiz.quiz1.question4;

public class Q4 {
    private static void div(){
        System.out.println(1/0);
    }    

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}
