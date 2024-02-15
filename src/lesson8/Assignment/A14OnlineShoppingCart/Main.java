package lesson8.Assignment.A14OnlineShoppingCart;

public class Main {
    public static void main(String[] args) {
        
        // creating items
        Item Tissue = new Item("Tissue", 5.50);
        Item Toothbrush = new Item("Toothbrush", 3.00);
        Item Detergent = new Item("Detergent", 25.00);

        // Online Shopping Cart
        ShoppingCart onlineCart = new OnlineShoppingCart();
        onlineCart.addItem(Tissue);
        onlineCart.addItem(Toothbrush);
        onlineCart.addItem(Detergent);

        System.out.println("Online Shopping Cart Total: RM " + onlineCart.calculateTotal() + "\n");

        onlineCart.removeItem(Toothbrush);

        System.out.println("Online Shopping Cart Total: RM " + onlineCart.calculateTotal()+ "\n");

        //In-Store shopping cart
        ShoppingCart inStoreCart = new InStoreShoppingCart();
        inStoreCart.addItem(Tissue);
        inStoreCart.addItem(Toothbrush);
        inStoreCart.addItem(Detergent);

        System.out.println("In-Store Shopping Cart Total: RM " + inStoreCart.calculateTotal()+ "\n");

        inStoreCart.removeItem(Tissue);

        System.out.println("In-Store Shopping Cart Total: RM " + inStoreCart.calculateTotal()+ "\n");

    }
}
