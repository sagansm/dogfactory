package me.ssagan.dogapp.model.evidence;

public enum Color {
    PINK(100), GREY(0), BLACK(50), BROUN(10), WHITE(80);
    private final int barbieLevel;

    Color(int barbieLevel) {
        this.barbieLevel = barbieLevel;
    }

    public int getBarbieLevel() {
        return barbieLevel;
    }
}
