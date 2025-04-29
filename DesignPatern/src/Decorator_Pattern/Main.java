package Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()); // Simple Coffee, Milk
        System.out.println("Cost: $" + coffee.cost()); // Cost: $7
    }
}

