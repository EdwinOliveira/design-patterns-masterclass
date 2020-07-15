package patterns.creational.factory;

import patterns.creational.factory.classes.Cat;
import patterns.creational.factory.classes.Dog;

public class AnimalFactory {

    public Animal getTypeOfAnimal(AnimalType animalType) {
        if (animalType == null) {
            return null;
        }

        switch (animalType) {
            case CAT:
                return (Animal) new Cat();
            case DOG:
                return (Animal) new Dog();
            default:
                return null;
        }
    }
}
