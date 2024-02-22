package Quiz.exam4.Test22;

public class Test22 {
    public static void main(String[] args) {
        GetSetGo[] arr = new GetSetGo[5];
        // this is accessing thru the object
        // arr[0].count

        for (GetSetGo obj : arr) {
            // obj.count++;
            int c = obj.count;
            System.err.println(c);
        }
        System.out.println(GetSetGo.count);
    }
}
