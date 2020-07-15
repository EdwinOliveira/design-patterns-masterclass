package patterns.creational.builder.classes;

public class Address {
    private final String postalCode;
    private final String street;

    public Address(String postalCode, String street) {
        this.postalCode = postalCode;
        this.street = street;
    }
}
