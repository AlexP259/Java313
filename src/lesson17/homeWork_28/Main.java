package lesson17.homeWork_28;

public class Main {
    public static void main(String[] args) {
        String w1 = "Собака", w2 = "Кот";
        ShortWord sh = new ShortWord(){
            @Override
            public String shortWord(String word1, String word2) {
                String result = word1.length() < word2.length() ? word1 : word2;
                return String.format("Первое слово: %1$s%nВторое слово: %2$s%nСамое короткое слово: %3$s",
                        word1, word2, result);
            }
        };
        System.out.println(sh.shortWord(w1, w2));
    }
}
