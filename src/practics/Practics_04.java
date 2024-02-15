package practics;

public class Practics_04 {
    public static void main(String[] args) {
        /*...........................................Задание 1......................................................*/
//        printOneNum();
        /*...........................................Задание 2......................................................*/
//        printMultiplicationNums();
        /*...........................................Задание 3......................................................*/
//        printMetricSystem();
        /*...........................................Задание 4......................................................*/
//        printAreOfTriangle();
        /*...........................................Задание 5......................................................*/
//        Scanner input = new Scanner(System.in);
//        printReversNum(input);
    }

    /*..........................................Методы к 1 заданию...................................................*/
//    public static void printOneNum(){
//        System.out.println("Результат: " + oneNum());
//    }
//    public static int oneNum() {
//        Scanner input = new Scanner(System.in);
//        int a, b, c;
//        System.out.print("Введите цифру №1 -> ");
//        a = input.nextInt();
//        System.out.print("Введите цифру №2 -> ");
//        b = input.nextInt();
//        System.out.print("Введите цифру №3 -> ");
//        c = input.nextInt();
//        input.close();
//        return a * 100 + b * 10 + c;
//    }
    /*..........................................Методы к 2 заданию...................................................*/
//    public static void printMultiplicationNums() {
//        System.out.println("Результат: " + multiplicationNums());
//    }
//    public static int multiplicationNums() {
//        Scanner input = new Scanner(System.in);
//        int[] array = new int[4];
//        int num, res = 0;
//        System.out.print("Введите целое четырёхзначное число -> ");
//        try {
//            num = input.nextInt();
//            if (num < 1000 || num > 9999) {
//                throw new Exception("Вы ввели не четырехзначное число. Попробуйте ещё раз");
//            }
//            array[0] = num / 1000;
//            array[1] = (num - (array[0] * 1000)) / 100;
//            array[2] = (num - (array[0] * 1000) - (array[1] * 100)) / 10;
//            array[3] = num - (array[0] * 1000) - (array[1] * 100) - (array[2] * 10);
//            res = array[0] * array[1] * array[2] * array[3];
//        } catch (InputMismatchException  e) {
//            System.out.println("Вы ввели не целое число. Попробуйте ещё раз");
//            res = multiplicationNums();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//            res = multiplicationNums();
//        } finally {
//            input.close();
//        }
//        return res;
//    }
    /*..........................................Методы к 3 заданию...................................................*/
//    public static void printMetricSystem() {
//        double printRes = metricSystem(0);
//        System.out.printf((int) printRes == printRes ? "%.0f" : "%f", printRes);
//    }
//    public static double metricSystem(double numMetr) {
//        double result = 0;
//        int choose;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите количество метров: ");
//        try {
//            numMetr = input.nextDouble();
//            System.out.println("В какую единицу измерения хотите перевести" + numMetr + "метров? Выберите цифру: " +
//                    "\n1) Сантиметры" +
//                    "\n2) Дециметры" +
//                    "\n3) Миллиметры" +
//                    "\n4) Мили");
//            choose = input.nextInt();
//            switch (choose) {
//                case 1 -> result = numMetr * 100;
//                case 2 -> result = numMetr * 10;
//                case 3 -> result = numMetr * 1000;
//                case 4 -> result = numMetr * 0.00062;
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Вы ввели не число. Попробуйте еще раз");
//            result = metricSystem(0);
//        }
//        input.close();
//        return result;
//    }
    /*..........................................Методы к 4 заданию...................................................*/
//    public static void printAreOfTriangle(){
//        double area = areOfTriangle(0, 0);
//        System.out.printf((int) area == area ? "Площадь треугольника: %1$.0f" : "Площадь треугольника: %1$.02f", area);
//    }
//    public static double areOfTriangle(double baseInput, double heightInput){
//        Scanner input = new Scanner(System.in);
//        double area = 0;
//        boolean validInput = false;
//        while(!validInput){
//            System.out.print("Введите размеры треугольника:\nОснование -> ");
//            try{
//                baseInput = input.nextDouble();
//                System.out.print("Высота -> ");
//                heightInput = input.nextDouble();
//                area = 0.5 * baseInput * heightInput;
//                validInput = true;
//            } catch(InputMismatchException e){
//                System.out.println("Вы ввели не целое число. Попробуйте еще раз");
//                input.next();
//            }
//        }
//        input.close();
//        return area;
//    }
    /*..........................................Методы к 5 заданию...................................................*/
//    public static void printReversNum(Scanner input){
//        System.out.println("Перевернутое число: " + reversNum(input));
//    }
//    public static int reversNum(Scanner input) {
//        int numInput, res = 0;
//        boolean validInput = false;
//        System.out.print("Введите четырехзначное число: ");
//        while (!validInput) {
//            try {
//                numInput = input.nextInt();
//                if (numInput < 1000 || numInput > 9999) {
//                    throw new Exception("Вы ввели не четырехзначное число. Попробуйте еще раз");
//                }
//                res = ((numInput % 10) * 1000) +    // пусть ввели 4321, тогда 1 * 1000 = 1000
//                        ((numInput % 100 - (numInput % 10)) * 10) +         // 20 * 10 = 200
//                        ((numInput % 1000) - (numInput % 100)) / 10 +       // 300 / 10 = 30
//                        ((numInput - (numInput % 1000)) / 1000);            //  (4321 - 321) / 1000 = 4
//                validInput = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели не число. Попробуйте еще раз");
//                input.next();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                input.next();
//            }
//        }
//        return res;
//    }
}











