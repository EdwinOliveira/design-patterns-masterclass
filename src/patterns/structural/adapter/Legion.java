package patterns.structural.adapter;

public class Legion implements Lenovo {
    @Override
    public void useTypeC() {
        System.out.println("Charging Lenovo Legion laptop...");
    }
}
