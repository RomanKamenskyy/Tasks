package day2;

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int i = a;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        scanner.close();
    }
}
