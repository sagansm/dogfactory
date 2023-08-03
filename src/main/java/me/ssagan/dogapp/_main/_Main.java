package me.ssagan.dogapp._main;

import me.ssagan.dogapp.model.comparator.BarbieLevelComparator;
import me.ssagan.dogapp.model.entity.Dog;
import me.ssagan.dogapp.model.comparator.DogAgeComparator;
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
