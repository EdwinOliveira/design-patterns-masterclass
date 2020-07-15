package patterns.structural.composite;

public class User implements Account {
    private final String name;
    private final double hours = 1 + Math.random() * 20;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Name: " + this.name + " " + "Hours: " + this.hours);
    }
}
