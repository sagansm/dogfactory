package me.ssagan.dogapp.model.entity;

import me.ssagan.dogapp.model.evidence.Color;

public class Dog {
    private static Long dogIdCounter = 0L;
    private Long id;
    private int age;
    private int weight;
    private Color color;

    public Dog(int age, int weight, Color color) {
        dogIdCounter++;
        this.id = dogIdCounter;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append(", color=").append(color);
        sb.append(", Barbie level=").append(color.getBarbieLevel());
        sb.append('}');
        return sb.toString();
    }

    public Color getColor() {
        return color;
    }
}
