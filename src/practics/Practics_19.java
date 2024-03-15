package practics;

public class Practics_19 {
    public static void main(String[] args) {
        System.out.println(maxOfThreeNum(3, 96, 7));
        System.out.println();

    }

    public static <T extends Number> T maxOfThreeNum (T a, T b, T c){
        double max = a.doubleValue();
        if (b.doubleValue() > max) max = b.doubleValue();
        if (c.doubleValue() > max) max = c.doubleValue();
        return (T) Double.valueOf(max);
    }
}
