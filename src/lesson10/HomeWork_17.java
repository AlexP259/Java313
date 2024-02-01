package lesson10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;

public class HomeWork_17 {
    public static void main(String[] args) {
        System.out.println(createPass(""));
    }

    public static String createPass(String password){
        Scanner input = new Scanner(System.in);
        String pattern = "(?=.*[@\\-_])(?=.*[0-9])(?=.*[A-Za-z])[0-9A-Za-z\\-@_]{6,18}";   // [0-9A-Za-z-@_]{6,18} - может состоять
        System.out.println("Придумайте пароль. Он должен состоять из из цифр, букв английского алфавита, символов " +
                "дефис, собака и подчеркивание. Длина пароля от 6 до 18 символов.");
        try {
            password = input.nextLine();
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(password);
            if (matcher.matches()){
                System.out.println("Пароль " + password + " принят");
            } else if (password.length() < 6 || password.length() > 18){
                throw new Exception("Длина пароля не соответствует требованиям. Попробуйте ещё раз");
            } else if (!matcher.matches()){
                throw new Exception("Пароль не соответствует требованиям. Попробуйте ещё раз");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            password = createPass(password);
        }
        return password;
    }
}
