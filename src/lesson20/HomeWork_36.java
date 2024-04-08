package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork_36 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 20, 33, 45, 52));
        int multiple4 = list.stream()
                .filter(x -> x % 4 == 0)
                .map(x -> x * 2)
                .reduce(0, (x, y) -> x + y);
        System.out.println(list + ": " + multiple4);
    }
}
