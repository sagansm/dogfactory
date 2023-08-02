package me.ssagan.dogapp.entity;

public enum DogBreed {
    AKITA, SPANIEL, BEAGLE, CORGI, POODLE;

    private static DogBreed[] list = DogBreed.values();

    public static DogBreed getDogBreed(int i) {
        return list[i];
    }

    public static int listGetLastIndex() {
        return list.length - 1;
    }
}
