package patterns.structural.decorator;

public abstract class MercedesDecorator implements IMercedes {
    protected IMercedes mercedes;

    protected MercedesDecorator(IMercedes mercedes) {
        this.mercedes = mercedes;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract int getCost();
}
