package day7;

public class Fly {
    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int amountFuel;

    public Fly(String producer, int year, int lenght, int weight) {
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.amountFuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAmountFuel() {
        return amountFuel;
    }

    public void setAmountFuel(int amountFuel) {
        this.amountFuel = amountFuel;
    }

    String getInfo() {
        return "Procedur "+producer+" year "+year +" lenghe "+lenght+" weight "+weight+" fuel "+amountFuel;
    }

    void fillUp(int liter){
        amountFuel += liter;
    }

    static void compareLenght(Fly fly1, Fly fly2){
        if(fly1.lenght > fly2.lenght){
            System.out.println("самолет " +fly1.producer +" больше");
        }
        else{
            System.out.println("самолет "+fly1.producer + " больше");
        }

    }

    @Override
    public String toString() {
        return "Fly{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", lenght=" + lenght +
                ", weight=" + weight +
                ", amountFuel=" + amountFuel +
                '}';
    }
}
