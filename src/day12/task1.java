package day12;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("Audi");
        list.add("BMV");
        list.add("Ford");

        System.out.println(list);

        list.add(1,"Mercedec");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
