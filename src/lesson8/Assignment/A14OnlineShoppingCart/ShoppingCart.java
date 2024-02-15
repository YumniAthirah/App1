package lesson8.Assignment.A14OnlineShoppingCart;

public interface ShoppingCart {
    void addItem(Item item);
    void removeItem (Item item);
    double calculateTotal();
}
