package Assignment.Assignment5.A14;

public interface ShoppingCart {
    <Item> void addItem(Item item);
    <Item> void removeItem (Item item);
    double calculateTotal();
}
