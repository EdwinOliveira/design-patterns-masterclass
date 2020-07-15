package patterns.structural.composite;

import java.util.ArrayList;

public class UserCollection implements Account {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public UserCollection() {}

    public void addUser(Account account) {
        this.accounts.add(account);
    }

    public void removeUser(Account account) {
        this.accounts.remove(account);
    }

    @Override
    public void showAccountDetails() {
        for (Account account : this.accounts) {
            account.showAccountDetails();
        }
    }
}
