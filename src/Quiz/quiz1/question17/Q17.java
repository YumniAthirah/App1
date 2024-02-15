package Quiz.quiz1.question17;

public class Q17 {
    public static void main(String[] args) {
        String [][] arr = {{"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String[] str:arr){
            for (String s : str) {
                System.out.print(s);
                if (s.length() == 4)
                break;
            }
            break;
        }
    }
}
