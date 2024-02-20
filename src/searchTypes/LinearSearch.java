package searchTypes;

public class LinearSearch {
    public static void main(String[] args) {
        int index = linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        System.out.println("Индекс искомого элемента: " + index);


    }


    /*...........................................Линейный поиск......................................................*/

    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }
}
