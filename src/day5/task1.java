package day5;

public class task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("yellow");
        car.getColor();
    }
}
class Car {
    private int year;
    private String color;
    private String model;

    public int getYear(){
        return year;
    }
    public void setYear( int year) {
        this.year = year;
    }
    public String getColor(){
        return color;
    }
    public void setColor( String color) {
        this.color = color ;
    }

    public String getModel() {
        return model;
    }
}