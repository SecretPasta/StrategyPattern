package strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 300);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay by CreditCard
        cart.pay(new CreditCardStrategy("1234567890123456", "John Doe", "786", "12/15"));

        // Pay by PayPal
        cart.pay(new PayPalStrategy("john.doe@example.com", "mypassword"));
    }
}