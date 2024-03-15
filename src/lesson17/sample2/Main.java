package lesson17.sample2;

public class Main {
    public static void main(String[] args) {
        String inStr = "Лямбда выражение в Java";
        System.out.println("Исходная строка: " + inStr);

        // Вызывая некий метод, мы можем передать ему в качестве параметра лямбда-выражение, которое реализует метод
        // из некоего интерфейса
        String outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре: " + outStr);


        outStr = stringOp(str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("Строка с удалёнными пробелами: " + outStr);


        outStr = stringOp(str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }, inStr);
        System.out.println("Развернутая строка: " + outStr);
    }


    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
}


interface StringFunc {
    String func(String n);
}