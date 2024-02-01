package lesson10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HomeWork_18_1 {
    public static void main(String[] args) {
        String str = "+7 499 456-45-78, +74994564578, +7 499 456 45 78, +7 499 456-45-78";

        String pattern = "\\+7[\\d -]+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
