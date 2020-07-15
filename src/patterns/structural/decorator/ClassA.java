package patterns.structural.decorator;

public class ClassA implements IMercedes {
    @Override
    public String getName() {
        return "Class A";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
