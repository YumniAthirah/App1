package Quiz.exam4;

public class Test40 {
    public static void main(String[] args) {
        String str = "Game on";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(str.contentEquals(sb));
        //System.out.println(sb.contentEquals(str));        //Line n4 : compilation error
        
        System.out.println(sb.equals(str));
        System.out.println(str.equals(sb));
    }
}
