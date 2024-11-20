package day4;

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length-1; i++) {
            int sum = 0;
            sum += array[i];
            sum += array[i+1];
            sum += array[i-1];
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i-1;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println(maxSum);
        System.out.println(maxIndex);

    }
}
