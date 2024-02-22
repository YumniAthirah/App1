package Quiz.exam4;

public class Test8 {
    public static void main(String[] args) {
        int score = 30;
        char grade = 'F';
        if(50 <= score && score < 60)
        grade = 'D';
        if(60 <= score && score < 70)
        grade = 'C';
        if(70 <= score && score < 80)
        grade = 'B';
        if(score >= 80)
        grade = 'A';
        System.out.println(grade);
    }
}
