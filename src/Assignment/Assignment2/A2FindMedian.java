package Assignment.Assignment2;

public class A2FindMedian {
    public static void main(String[] args) {
        int[] randoms = { 5, 10, 23, 32 };

        System.out.print("\nmod:");
        double med = arrayMedian(randoms);
        System.out.print(med);

    }

    public static double arrayMedian(int[] d) {
        double med;
        int n = d.length;

        if (n % 2 == 0) {
            int i = (n - 1) / 2;
            int i2 = n / 2;
            med = ((double)d[i] + (double)d[i2]) / 2;
        } else {
            int i = n / 2;
            med = d[i];
        }
        return med;
    }
}
