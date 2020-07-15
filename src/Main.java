import patterns.behavioral.strategy.Car;
import patterns.behavioral.strategy.TurnCarLightsOnDownward;
import patterns.behavioral.strategy.TurnCarOnByKey;
import patterns.behavioral.templateMethod.ErrorLog;
import patterns.behavioral.templateMethod.LogTemplate;
import patterns.creational.builder.UserBuilder;
import patterns.creational.builder.classes.Account;
import patterns.creational.builder.classes.Address;
import patterns.creational.factory.AnimalFactory;
import patterns.creational.factory.AnimalType;
import patterns.creational.singleton.Singleton;
import patterns.structural.adapter.Rog;
import patterns.structural.adapter.TypeUsbToTypeC;
import patterns.structural.bridge.DeluxeCoffeeCup;
import patterns.structural.bridge.Latte;
import patterns.structural.composite.User;
import patterns.structural.composite.UserCollection;
import patterns.structural.decorator.ClassA;
import patterns.structural.decorator.FashionSeatsDecorator;
import patterns.structural.decorator.MercedesDecorator;
import patterns.structural.proxy.AccountProxy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        singleton();
        factory();
        builder();
        adapter();
        composite();
        proxy();
        decorator();
        bridge();
        templateMethod();
        strategy();
    }

    private static void singleton() {
        System.out.println(Singleton.getInstance());
    }

    private static void factory() {
        new AnimalFactory().getTypeOfAnimal(AnimalType.CAT).makeSound();
    }

    private static void builder() {
        UserBuilder userBuilder = new UserBuilder("Diogo")
                .setAccount(new Account("diogoXD97", "123456"))
                .setAddress(new Address("3670-356", "Rua da Senhora de Ajuda"))
                .setAge(20);

        System.out.println(userBuilder);
    }

    private static void adapter() {
        Rog rog = new Rog();
        TypeUsbToTypeC typeCToUsbAdapter = new TypeUsbToTypeC(rog);

        typeCToUsbAdapter.useTypeC();
    }

    private static void composite() {
        User userV1 = new User("Diogo");
        User userV2 = new User("Joao");
        User userV3 = new User("Tiago");

        UserCollection userCollection = new UserCollection();
        userCollection.addUser(userV1);
        userCollection.addUser(userV2);
        userCollection.addUser(userV3);

        userCollection.removeUser(userV2);

        userCollection.showAccountDetails();
    }

    private static void proxy() {
        ArrayList<patterns.structural.proxy.User> users = new ArrayList<>();
        patterns.structural.proxy.User user = new patterns.structural.proxy.User("Diogo");
        patterns.structural.proxy.User user1 = new patterns.structural.proxy.User("Tiago");
        patterns.structural.proxy.User user2 = new patterns.structural.proxy.User("Joao");
        patterns.structural.proxy.User user3 = new patterns.structural.proxy.User("Francisco");

        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        AccountProxy accountProxy = new AccountProxy(users);
        accountProxy.showUsers();
    }

    private static void decorator() {
        ClassA classA = new ClassA();
        MercedesDecorator mercedesDecorator = new FashionSeatsDecorator(classA);
        MercedesDecorator mercedesDecorator1 = new FashionSeatsDecorator(mercedesDecorator);
        System.out.println(mercedesDecorator1.getCost());
    }

    private static void bridge() {
        Latte latte = new Latte();
        DeluxeCoffeeCup deluxeCoffeeCup = new DeluxeCoffeeCup(latte);
        deluxeCoffeeCup.showCoffee();
    }

    private static void templateMethod() {
        LogTemplate errorLog = new ErrorLog();
        errorLog.createLog();
    }

    private static void strategy() {
        TurnCarLightsOnDownward turnCarLightsOnDownward = new TurnCarLightsOnDownward();
        TurnCarOnByKey turnCarOnByKey = new TurnCarOnByKey();

        Car car = new Car(turnCarLightsOnDownward, turnCarOnByKey);
        car.turnCarLightsOn();
        car.turnCarOn();
    }
}
