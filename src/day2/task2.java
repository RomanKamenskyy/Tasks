package day2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0 && i %10 != 0) {
                    System.out.print(i+" ");
                }

            }
        }
        else {
            for (int i = b; i <= a; i++) {
                if (i % 5 == 0 && i %10 != 0) {
                    System.out.print(i+" ");
                }

            }
        }
        scanner.close();
    }
}
