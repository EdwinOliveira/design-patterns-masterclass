package patterns.structural.bridge;

public abstract class CoffeeCup {
    ICoffee iCoffee = null;

    protected CoffeeCup(ICoffee iCoffee) {
        this.iCoffee = iCoffee;
    }

    protected abstract void showCoffee();
}
