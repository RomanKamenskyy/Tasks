package day4;


import java.util.Arrays;
import java.util.Random;



public class task2 {
    public static void main(String[] args) {
        int[] arrayList = new int[100];
        int minInt= 1000;
        int maxInt= 0;
        int count0 = 0;
        int count0Sum = 0;

        Random randomInt = new Random();

        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = randomInt.nextInt(10000 );
        }
        for (int j : arrayList) {
            if (j < minInt)
                minInt = j;
            if (j > maxInt)
                maxInt = j;
            if (j % 10 == 0) {
                count0++;
                count0Sum += j;
            }
        }
        //Arrays.sort(arrayList);
        System.out.println(Arrays.toString(arrayList));
        System.out.println(minInt);
        System.out.println(maxInt);
        System.out.println(count0);
        System.out.println(count0Sum);



    }
}
