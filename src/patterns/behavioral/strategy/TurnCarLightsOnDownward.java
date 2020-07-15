package patterns.behavioral.strategy;

public class TurnCarLightsOnDownward implements ITurnCarLightsOnBehaviour {

    @Override
    public void igniteCarLights() {
        System.out.println("Car lights are being turned on downwards!");
    }
}
