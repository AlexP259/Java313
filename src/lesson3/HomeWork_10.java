package lesson3;

public class HomeWork_10 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr1 = new int[n][n];
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 11);
                System.out.print(j == n - 1 ? arr1[i][j] : arr1[i][j] + "\t");
            }
            System.out.println();
        }
        int[] arr2 = new int[n];
        System.out.println("Одномерный массив: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 11);
            System.out.print(i == n - 1 ? arr2[i] + "\n\n" : arr2[i] + "\t");
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i % 2 != 0) {
                    arr1[i] = arr2;
                }
                System.out.print(j == n - 1 ? arr1[i][j] : arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
