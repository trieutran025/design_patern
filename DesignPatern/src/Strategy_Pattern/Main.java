package Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCard());
        cart.checkout(100);
    }
}
