package patterns.creational.factory.classes;

import patterns.creational.factory.Animal;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Auff Auff");
    }
}
