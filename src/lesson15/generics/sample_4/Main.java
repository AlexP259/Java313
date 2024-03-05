package lesson15.generics.sample_4;

public class Main {
    public static void main(String[] args) {
        Short[] ar = new Short[]{1, 2, 3, 4};
        Short val = 4;
//        Integer[] ar = new Integer[]{1, 2, 3, 4};
//        Integer val = 4;

        boolean flIn = Math.<Short>isIn(val, ar);       // Ограничение какой тип данных должен приниматься
        System.out.println(flIn);
    }
}

class Math{
    public static <T> boolean isIn(T val, T[] ar){
        for (T v : ar) {
            if (v.equals(val)) {
                return true;
            }
        }
        return false;
    }
}
