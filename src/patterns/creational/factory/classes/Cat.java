package patterns.creational.factory.classes;

import patterns.creational.factory.Animal;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meowww");
    }
}
