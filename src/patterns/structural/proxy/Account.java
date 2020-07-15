package patterns.structural.proxy;

import java.util.ArrayList;

public class Account implements IAccount {
    private ArrayList<User> users = new ArrayList<User>();

    public Account(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public void showUsers() {
        for (User user: this.users) {
            System.out.println(user.getName());
        }
    }
}
