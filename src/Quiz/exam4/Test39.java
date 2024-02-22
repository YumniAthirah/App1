package Quiz.exam4;

public class Test39 {
    public static void main(String[] args) {
        outer : for(int i = 0; i < 3; System.out.println(i + "i")){
            i++;
            inner : for(int j = 0; j < 3; System.out.println(j + "j")){
                if(i > ++j){
                    break outer;
                }
            }
        }
    }
}
