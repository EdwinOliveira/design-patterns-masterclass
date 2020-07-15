package patterns.creational.builder.classes;

public class User {
    // Required Fields
    private final String name;

    // Option Fields
    private int age;
    private Address address;
    private Account account;

    public User(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
