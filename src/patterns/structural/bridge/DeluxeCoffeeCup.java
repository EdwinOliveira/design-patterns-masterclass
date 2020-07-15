package patterns.structural.bridge;

public class DeluxeCoffeeCup extends CoffeeCup {

    public DeluxeCoffeeCup(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public void showCoffee() {
        this.iCoffee.showTypeSugar();
        this.iCoffee.showTypeCoffeeBeans();
    }
}
