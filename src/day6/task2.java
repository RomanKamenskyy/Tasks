package day6;

public class task2 {
    public static void main(String[] args) {
        Fly fly = new Fly("airBus", 2005, 300,  20);
       // System.out.println(fly.amountFuel);
        System.out.println(fly.getInfo());

        fly.fillUp(10);
        System.out.println(fly.getInfo());
        Fly fly2 = new Fly("Boeng", 2010, 400,  40);
        fly2.setYear(2020);
        System.out.println(fly2.getInfo());

    }
}
