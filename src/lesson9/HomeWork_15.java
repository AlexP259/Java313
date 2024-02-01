package lesson9;

public class HomeWork_15 {
    public static void main(String[] args) {
        String orig = "один два";
        System.out.println(orig);

        String str1 = orig.split(" ")[1] + " " + orig.split(" ")[0];
        System.out.println(str1);

        String str2 = orig.substring(orig.indexOf(" ") + 1) + " " + orig.substring(0, orig.indexOf(" "));
        System.out.println(str2 + "\n");




        String text = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
        System.out.println(text);
        String first = text.substring(0, text.indexOf("о") + 1);
        String replace = text.substring(text.indexOf("о") + 1, text.lastIndexOf('о')).replace("о", "О");
        String last = text.substring(text.lastIndexOf("о"));
        String res = first + replace + last;
        System.out.println(res + "\n");


        String text2 = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
        System.out.println(text2);
        String replace2 = "";
        for (int i = text2.indexOf('о') + 1; i < text2.lastIndexOf('о'); i++) {
            if (text2.charAt(i) == 'о'){
                replace2 += text2.substring(i, i + 1).replace("о", "О");
            } else {
                replace2 += text2.substring(i, i + 1);
            }
        }
        String res2 = text.substring(0, text.indexOf('о') + 1) + replace2 + text.substring(text.lastIndexOf('о'));
        System.out.println(res2);
    }
}
