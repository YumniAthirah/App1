package lesson8.Assignment.A14;

public interface ShoppingCart {
    <Item> void addItem(Item item);
    <Item> void removeItem (Item item);
    double calculateTotal();
}
