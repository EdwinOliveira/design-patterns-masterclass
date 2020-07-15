package patterns.behavioral.strategy;

public class Car {
    private final ITurnCarLightsOnBehaviour iTurnCarLightsOnBehaviour;
    private final ITurnCarOnBehaviour iTurnCarOnBehaviour;

    public Car(ITurnCarLightsOnBehaviour iTurnCarLightsOnBehaviour, ITurnCarOnBehaviour iTurnCarOnBehaviour) {
        this.iTurnCarLightsOnBehaviour = iTurnCarLightsOnBehaviour;
        this.iTurnCarOnBehaviour = iTurnCarOnBehaviour;
    }

    public void turnCarLightsOn() {
        this.iTurnCarLightsOnBehaviour.igniteCarLights();
    }

    public void turnCarOn() {
        this.iTurnCarOnBehaviour.igniteCar();
    }
}
