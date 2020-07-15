package patterns.structural.adapter;

public class Rog implements Asus{
    @Override
    public void useUSB() {
        System.out.println("Charging Asus Rog laptop...");
    }
}
