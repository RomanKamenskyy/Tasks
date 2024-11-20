package day6;

public class task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("yellow");
        car.setYear(2008);
        car.setModel("dodge");

        Motocycle motocycle = new Motocycle(2005, "white", "yamaha");

        motocycle.Name();
        car.Name();
        System.out.println(motocycle.CountAge(1910));
        System.out.println(car.CountAge(2015));
    }
}
