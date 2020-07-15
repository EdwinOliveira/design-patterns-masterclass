package patterns.structural.bridge;

public class Cappuccino implements ICoffee {
    @Override
    public void showTypeSugar() {
        System.out.println("White Sugar");
    }

    @Override
    public void showTypeCoffeeBeans() {
        System.out.println("Brazilian Beans");
    }
}
