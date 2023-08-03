package me.ssagan.dogapp.model.entity;

import me.ssagan.dogapp.model.evidence.Color;
import me.ssagan.dogapp.model.evidence.DogBreed;

public class DogFactory {
    private static DogFactory instance;

    private DogFactory() {
    }

    public static DogFactory getInstance() {
        if (instance == null) {
            instance = new DogFactory();
        }
        return instance;
    }

    public Dog createDog(DogBreed breed, int age, int weight, Color color) {
        Dog dog = null;
        switch (breed) {
            case AKITA:
                dog = new Akita(age, weight, color);
                break;
            case SPANIEL:
                dog = new Spaniel(age, weight, color);
                break;
            case BEAGLE:
                dog = new Beagle(age, weight, color);
                break;
            case CORGI:
                dog = new Corgi(age, weight, color);
                break;
            case POODLE:
                dog = new Poodle(age, weight, color);
                break;
        }
        return dog;
    }
}
