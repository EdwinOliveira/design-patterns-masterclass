package patterns.structural.proxy;

import java.util.ArrayList;

public class AccountProxy implements IAccount {
    private ArrayList<User> users = new ArrayList<User>();

    public AccountProxy(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public void showUsers() {
        new Account(this.users).showUsers();
    }
}
