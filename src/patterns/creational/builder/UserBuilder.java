package patterns.creational.builder;

import patterns.creational.builder.classes.Account;
import patterns.creational.builder.classes.Address;
import patterns.creational.builder.classes.User;

public class UserBuilder {
    private final User user;

    public UserBuilder(String name) {
        this.user = new User(name);
    }

    public UserBuilder setAge(int age) {
        this.user.setAge(age);
        return this;
    }

    public UserBuilder setAccount(Account account) {
        this.user.setAccount(account);
        return this;
    }

    public UserBuilder setAddress(Address address) {
        this.user.setAddress(address);
        return this;
    }
}
