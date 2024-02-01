package lesson2;

public class HomeWork_3_1 {
    public static void main(String[] args) {
        System.out.printf("Переменная типа %-7sзанимает %d Байт памяти (%-4dбит памяти), и принимает значения в " +
                "диапазоне от %d до %d%n", Byte.TYPE, Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Переменная типа %-7sзанимает %d Байт памяти (%-4dбит памяти), и принимает значения в " +
                "диапазоне от %d до %d%n", Short.TYPE, Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Переменная типа %-7sзанимает %d Байт памяти (%-4dбит памяти), и принимает значения в " +
                "диапазоне от %d до %d%n", Integer.TYPE, Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Переменная типа %-7sзанимает %d Байт памяти (%-4dбит памяти), и принимает значения в " +
                "диапазоне от %d до %d%n%n", Long.TYPE, Long.BYTES, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Переменная типа %-7sзанимает %d Байт памяти (%-4dбит памяти), и принимает значения в " +
                "диапазоне от %e до %e%n", Float.TYPE, Float.BYTES, Float.SIZE,  Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Переменная типа %-7sзанимает %d Байт памяти (%-4dбит памяти), и принимает значения в " +
                "диапазоне от %e до %e%n", Double.TYPE, Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
