package me.ssagan.dogapp.entity;

public enum Color {
    PINK(100), GREY(0), BLACK(50), BROUN(10), WHITE(80);
    private int barbieLevel;

    private static Color[] list = Color.values();

    Color(int barbieLevel) {
        this.barbieLevel = barbieLevel;
    }

    public int getBarbieLevel() {
        return barbieLevel;
    }

    public static Color getColor(int i) {
        return list[i];
    }

    public static int listGetLastIndex() {
        return list.length - 1;
    }
}
