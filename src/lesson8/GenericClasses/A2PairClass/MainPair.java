package lesson8.GenericClasses.A2PairClass;

public class MainPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Yumni", 24);

        System.out.println("Name: " + pair.getFirst());
        System.out.println("Age: " + pair.getSecond());

        pair.setFirst("Athirah");
        pair.setSecond(32);

        System.out.println("Name: " + pair.getFirst());
        System.out.println("Age: " + pair.getSecond());

    }
}
