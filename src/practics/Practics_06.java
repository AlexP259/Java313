package practics;

public class Practics_06 {
    public static void main(String[] args) {
        /*...........................................Задание 1......................................................*/
//        happyNum();
        /*...........................................Задание 2......................................................*/
//        printReplaceTwoDigitsInput();
    }


    /*..........................................Методы к 1 заданию...................................................*/
//    public static void happyNum(){
//        if (scanHappyNumOrNot() == true){
//            System.out.println("Число является счастливым!");
//        } else {
//            System.out.println("Число не является счастливым...");
//        }
//    }
//    public static boolean scanHappyNumOrNot(){
//        Scanner input = new Scanner(System.in);
//        int num = 0;
//        boolean validNum = false;
//        System.out.println("Введите шестизначное число: ");
//        do {
//            try{
//                num = input.nextInt();
//                if (String.valueOf(num).length() != 6){
//                    throw new Exception("Вы ввели не шестизначное число");
//                } else {
//                    validNum = true;
//                }
//            } catch (InputMismatchException e){
//                System.out.println("Вы ввели не целое число");
//                input.next();
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        } while (!validNum);
//        input.close();
//        return happyNumOrNot(num);
//    }
//    public static boolean happyNumOrNot(int num){
//        int digit1, digit2, digit3, digit4, digit5, digit6;
//        digit1 = num / 100000;
//        digit2 = num / 10000 % 10;
//        digit3 = num / 1000 % 10;
//        digit4 = num / 100 % 10;
//        digit5 = num / 10 % 10;
//        digit6 = num % 10 ;
//        return digit1 + digit2 + digit3 == digit4 + digit5 + digit6;
//    }
    /*..........................................Методы к 2 заданию...................................................*/
//    public static void printReplaceTwoDigitsInput(){
//        System.out.println(replaceTwoDigitsInput());
//    }
//    public static int replaceTwoDigitsInput(){
//        // тут пользователь вводит число. Для числа вызываем метод
//        // replaceTwoDigits, который должен поменять местами первую и последнюю цифры, а также вторую и предпоследнюю
//        Scanner input = new Scanner(System.in);
//        int num = 0;
//        boolean validInput = false;
//        System.out.print("Введите целочисленное шестизначное число: ");
//        while (!validInput) {
//            try {
//                num = input.nextInt();
//                if (String.valueOf(num).length() == 6) {
//                    validInput = true;
//                } else {
//                    throw new IllegalArgumentException ("Вы ввели не шестизначное число");
//                }
//            } catch(InputMismatchException e){
//                System.out.println("Вы ввели не число. Попробуйте ещё раз");
//                input.next();
//            } catch(Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        num = replaceTwoDigits(num);
//        return num;
//    }
//    public static int replaceTwoDigits(int num) {
//        // сюда передали число, полученное в методе replaceTwoDigitsInput
//        int[] digits = new int[6];
//        int result = 0;
//        for (int i = 5; i >= 0; i--) {
//            digits[i] = num % 10;
//            num /= 10;
//        }
//        digits[5] = digits[0] ^ digits[5];  // меняем последнюю и первую цифру местами, пока в массиве
//        digits[0] = digits[0] ^ digits[5];
//        digits[5] = digits[0] ^ digits[5];
//
//        digits[4] = digits[1] ^ digits[4];  // меняем предпоследнюю и вторую цифру местами, пока в массиве
//        digits[1] = digits[1] ^ digits[4];
//        digits[4] = digits[1] ^ digits[4];
//
//        for (int i = 0; i < 6; i++) {
//            result = result * 10 + digits[i];
//        }
//        return result;
//    }
}







