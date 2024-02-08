package Assignment;

public class A2FindMod {
    public static void main(String[] args) {
        int[] randoms = { 5, 23, 23, 23, 32, 32, 54 };  //23
        int[] randoms2 = { 5, 8, 23, 23, 32, 32, 54 };  //23 and 32
        int[] randoms3 = { 5, 8, 10, 23, 32, 42, 54 };  //none

        System.out.print("\nmod:");
        int mod = arrayMod(randoms);
        System.out.print(mod);

        System.out.print("\nmod2:");
        int mod2 = arrayMod(randoms2);
        System.out.print(mod2);
        
        System.out.print("\nmod3:");
        int mod3 = arrayMod(randoms3);
        System.out.print(mod3);

        

    }

    public static int arrayMod(int[] d) {
        int k, count;
        int n = d.length;
        int maxCount = 0;
        int mod = d[0];

        for (int i = 0; i < n; i++) {
            k = d[i];
            count = 0;
            for (int j = 0; j < n; j++) {
                if (d[j] == k) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    mod = d[i];
                }
            }
        }

        return mod;
    }
}
