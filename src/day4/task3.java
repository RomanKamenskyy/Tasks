package day4;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[][] arraylist = new int[12][8];
        int maxSum = 0;
        int maxRow = 0;

        Random random = new Random();
        //System.out.println(arraylist[2].length);
        //System.out.println(arraylist.length);
        for (int i =0; i<arraylist.length;i++){
           for (int j =0; j<arraylist[i].length;j++){
               arraylist[i][j] = random.nextInt(50);
           }
        }

        for (int i =0; i<arraylist.length;i++) {
            int a = 0;

            for (int j =0; j<arraylist[i].length;j++){
                a += arraylist[i][j];
            }
            if (a> maxSum){
                maxSum = a;
                maxRow = i;
            }
        }
        for (int i =0; i<arraylist.length;i++){
            for (int j =0; j<arraylist[i].length;j++){
                System.out.print(arraylist[i][j]+"   ");
            }
            System.out.println("");
        }
        System.out.println(maxSum);
        System.out.println(maxRow);
    }
}
