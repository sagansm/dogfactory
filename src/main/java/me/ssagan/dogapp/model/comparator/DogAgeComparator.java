package me.ssagan.dogapp.model.comparator;

import me.ssagan.dogapp.model.entity.Dog;

import java.util.Comparator;

public class DogAgeComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge() - o2.getAge();
    }
}
