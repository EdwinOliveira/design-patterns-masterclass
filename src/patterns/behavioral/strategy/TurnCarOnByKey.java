package patterns.behavioral.strategy;

public class TurnCarOnByKey implements ITurnCarOnBehaviour {
    @Override
    public void igniteCar() {
        System.out.println("Car is being turned on by key");
    }
}
