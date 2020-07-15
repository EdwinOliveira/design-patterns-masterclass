package patterns.structural.bridge;

public class Latte implements ICoffee {

    @Override
    public void showTypeSugar() {
        System.out.println("Yellow Sugar");
    }

    @Override
    public void showTypeCoffeeBeans() {
        System.out.println("Colombian Beans");
    }
}
