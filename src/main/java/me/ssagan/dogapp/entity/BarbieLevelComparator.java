package me.ssagan.dogapp.entity;

import java.util.Comparator;

public class BarbieLevelComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o2.getColor().getBarbieLevel() - o1.getColor().getBarbieLevel();
    }
}
