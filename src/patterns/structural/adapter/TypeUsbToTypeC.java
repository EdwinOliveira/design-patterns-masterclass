package patterns.structural.adapter;

public class TypeUsbToTypeC implements Lenovo {
    private final Asus asus;

    public TypeUsbToTypeC(Asus asus) {
        this.asus = asus;
    }

    @Override
    public void useTypeC() {
        System.out.println("Adapting the charger");
        this.asus.useUSB();
    }

    /*
     * Rog wants to charge;
     * Adapter connects to USB input;
     * Adapter connects to TypeC input that is plugged to the energy;
     * Rox starts to charge
     */
}
