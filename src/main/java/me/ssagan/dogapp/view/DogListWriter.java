package me.ssagan.dogapp.view;

import me.ssagan.dogapp.entity.Dog;

import java.util.ArrayList;

public class DogListWriter {

    private static DogListWriter instance;

    private DogListWriter() {
    }

    public static DogListWriter getInstance() {
        if (instance == null) {
            instance = new DogListWriter();
        }
        return instance;
    }

    public void display(String caption, ArrayList<Dog> dogList) {
        System.out.println(caption + ": ");
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
        System.out.println("--------------------");
    }
}
