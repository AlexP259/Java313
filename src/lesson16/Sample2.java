package lesson16;

import javax.swing.*;

public class Sample2 {
    public static void main(String[] args) {
        String text = "PHP";
        System.out.println("Исходная строка: " + text);
        try{
            checkVowels(text);
        } catch (NoVowelsException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

    public static void checkVowels(String text) throws NoVowelsException{
        boolean containsVowels = false;
        String vowels = "aeiouyAEIOUY";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(vowels.contains(String.valueOf(ch))){
                containsVowels = true;
                break;

            }
        }

        if (!containsVowels){
            throw new NoVowelsException("Строка не содержит гласные буквы");
        }
    }
}


class NoVowelsException extends Exception{
    public NoVowelsException(String message) {
        super(message);
    }
}
