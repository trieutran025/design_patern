package Strategy_Pattern;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCard implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }
}

class PayPal implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}

class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        strategy.pay(amount);
    }
}

