package day4;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputArrayLength = scanner.nextInt();
        int[] inputArray = new int[inputArrayLength];

        for (int i = 0; i < inputArrayLength; i++) {
            inputArray[i] = (int) (Math.random() * 10) + 1;
        }
        int countMore8 = 0;
        int equal1 = 0;
        int even = 0;
        int notEven = 0;
        int sumAllElements = 0;

        for (int i = 0; i < inputArrayLength; i++) {
            if (inputArray[i] > 8)
                countMore8++;

            if (inputArray[i] == 1)
                equal1++;

            if (inputArray[i] % 2 == 0)
                even++;

            if (inputArray[i] % 2 != 0)
                notEven++;

            sumAllElements += inputArray[i];

        }



        System.out.println(Arrays.toString(inputArray));
        System.out.println(countMore8);
        System.out.println(equal1);
        System.out.println(even);
        System.out.println(notEven);
        System.out.println(sumAllElements);

    }
}
