package lesson8.GenericClasses.A7GenericMap;

public class MainMap {
    public static void main(String[] args) {
        
        GenericMap<String, Double> storeMap = new GenericMap<>();

        //add key-value pairs
        storeMap.add("Tissue", 5.50);
        storeMap.add("Toothbrush", 3.20);
        storeMap.add("Detergent", 25.00);

        //retrieve value
        System.out.println("The price for Tissue: ");
        System.out.println("RM" + storeMap.get("Tissue"));

        //check if key exists
        System.out.println("\nIs there Toothbrush in the store?");
        System.out.println(storeMap.containsKey("Toothbrush"));

        //remove key-value pair
        System.out.println("Attention: Tissue is removed");
        storeMap.remove("Tissue");

        //check updated map
        System.out.println("\nIs there Tissue in the store?");
        System.out.println(storeMap.containsKey("Tissue"));
    }
}
