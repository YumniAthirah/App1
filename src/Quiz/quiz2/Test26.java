package Quiz.quiz2;

public class Test26 {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

// 0

/*
 * We have not passed any command-line arguments,
 * hence args refers to an array object of Size 0.
 * 
 * args.length prints 0. args is not null and
 * hence no NullPointerException.
 * 
 * Also we are not accessing array element
 * so no question ofArrayIndexOutOfBoundsException as well.
 */
