package day6;

import static java.lang.Math.abs;

public class Motocycle {
    private int year;
    private String color;
    private String model;

    public Motocycle(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void Name() {
        System.out.println("This is motor");
    }
    public int CountAge(int currentYear){
        return abs(currentYear - year);
    }
}
