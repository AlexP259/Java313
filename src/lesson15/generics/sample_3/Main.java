package lesson15.generics.sample_3;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        Average<Integer> integerAverage = new Average<>(intArray);
        System.out.println("Среднее арифметическое для Integer " + integerAverage.average());
        Average<Double> doubleAverage = new Average<>(doubleArray);
        System.out.println("Среднее арифметическое для Double " + doubleAverage.average());
    }
}


class Average<T extends Number>{
    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }

    public double average(){
        double sum = 0;
        for (T value : array) {
            sum +=  value.doubleValue();
        }
        return sum / array.length;
    }
}
