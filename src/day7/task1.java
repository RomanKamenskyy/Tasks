package day7;

public class task1 {
    public static void main(String[] args) {
        Fly fly1 = new Fly("airbus", 2010, 200, 2000);
        Fly fly2 = new Fly("boeng", 2020, 300, 2000);

        Fly.compareLenght(fly1, fly2);
    }
}
