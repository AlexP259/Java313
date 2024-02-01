package lesson8;

public class HomeWork_14 {
    public static void main(String[] args) {

        int[] mas = {-2, 3, 8, -11, -4, 6};
        System.out.println(numOfNegativeValues(mas, 0, 0));
    }

    public static int numOfNegativeValues(int[] array, int i, int n){
        if (i < array.length) {
            if (array[i++] < 0) {
                n++;
            }
            return numOfNegativeValues(array, i, n);
        } else {
            return n;
        }
    }
}
