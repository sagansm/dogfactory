package me.ssagan.dogapp.util;

import me.ssagan.dogapp.model.entity.Dog;
import me.ssagan.dogapp.model.entity.DogFactory;
import me.ssagan.dogapp.model.evidence.Color;
import me.ssagan.dogapp.model.evidence.DogBreed;

import java.util.ArrayList;

public class DogGenerator {
    private static DogGenerator instance;

    private DogGenerator() {
    }

    public static DogGenerator getInstance() {
        if (instance == null) {
            instance = new DogGenerator();
        }
        return instance;
    }

    public ArrayList<Dog> generateDogList(int dogAmount) {
        DogFactory dogFactory = DogFactory.getInstance();
        ArrayList<Dog> dogList = new ArrayList<>();
        for (int i = 0; i < dogAmount; i++) {
            dogList.add(dogFactory
                    .createDog(getRandomBreed(), (int) (Math.random() * 10), (int) (Math.random() * 20), getRandomColor()));
        }
        return dogList;
    }

    private Color getRandomColor() {
        return Color.values()[(int) (Math.random() * (Color.values().length))];
    }

    private DogBreed getRandomBreed() {
        return DogBreed.values()[(int) (Math.random() * (DogBreed.values().length))];
    }
}
