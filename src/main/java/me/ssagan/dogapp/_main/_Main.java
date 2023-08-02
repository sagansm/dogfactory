package me.ssagan.dogapp._main;

import me.ssagan.dogapp.entity.BarbieLevelComparator;
import me.ssagan.dogapp.entity.Dog;
import me.ssagan.dogapp.entity.DogAgeComparator;
import me.ssagan.dogapp.util.DogGenerator;
import me.ssagan.dogapp.view.DogListWriter;

import java.util.ArrayList;

public class _Main {

    public static void main(String[] args) {
        ArrayList<Dog> dogList = DogGenerator.getInstance().generateDogList(10);
        DogListWriter dogListWriter = DogListWriter.getInstance();
        dogListWriter.display("Список собак", dogList);
        dogList.sort(new DogAgeComparator());
        dogListWriter.display("Собаки по возрасту", dogList);
        dogList.sort(new BarbieLevelComparator());
        dogListWriter.display("Собаки по Барби-цвету", dogList);
    }
}
