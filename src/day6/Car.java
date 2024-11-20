package day6;

import static java.lang.Math.abs;

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void Name() {
        System.out.println("This is Car");
    }

    public int CountAge(int currentYear){
        return abs(currentYear - year);
    }
}
