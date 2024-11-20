package day2;

import javax.swing.*;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        scanner.close();

        if (inputValue >0 && inputValue <5) {
            System.out.println("малоэтажный дом");
        }
        else if (inputValue >4 && inputValue <9) {
            System.out.println("cреднетажный дом");
        }
        else if (inputValue >8 ) {
            System.out.println("многоэтажный дом");
        }
        else if (inputValue < 0){
            System.out.println("вы ввели не правильное число");
        }

    }
}
