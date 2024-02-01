package lesson3;

import java.util.Scanner;

public class HomeWork_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество звездочек на сторону: ");


        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                if (i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i == 0) {
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
        input.close();


//        int rowsCounter = 0;
//        while (rowsCounter < n){
//            int colsCounter = 0;
//            while (colsCounter <= rowsCounter){
//                if (colsCounter == 0 || colsCounter == rowsCounter || rowsCounter == n - 1){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                colsCounter++;
//            }
//            System.out.println();
//            rowsCounter++;
//        }
//        input.close();

    }
}
