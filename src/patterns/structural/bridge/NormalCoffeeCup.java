package patterns.structural.bridge;

public class NormalCoffeeCup extends CoffeeCup {

    public NormalCoffeeCup(ICoffee iCoffee) {
        super(iCoffee);
    }

    @Override
    public void showCoffee() {
        this.iCoffee.showTypeSugar();
        this.iCoffee.showTypeCoffeeBeans();
    }
}
