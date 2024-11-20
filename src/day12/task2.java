package day12;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main (String[] arg){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<=30; i++){
            if (i%2 == 0){
               // list.add(String.valueOf(i));
                list.add(i);
            }
        }
        for (int i=300; i<=3500; i++){
            if (i%2 == 0){
               // list.add(String.valueOf(i));
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
