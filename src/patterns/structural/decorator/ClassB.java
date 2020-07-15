package patterns.structural.decorator;

public class ClassB implements IMercedes {
    @Override
    public String getName() {
        return "Class B";
    }

    @Override
    public int getCost() {
        return 2500;
    }
}
