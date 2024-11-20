package day9;

public class Human {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo(){
        System.out.println("Это человек с именем " + name);
    }
}
