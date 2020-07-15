package patterns.structural.decorator;

public class FashionSeatsDecorator extends MercedesDecorator {

    public FashionSeatsDecorator(IMercedes mercedes) {
        super(mercedes);
    }

    @Override
    public String getName() {
        return this.mercedes.getName() + "Fashion Seats";
    }

    @Override
    public int getCost() {
        int price = this.mercedes.getCost() + 50;

        return price;
    }
}
