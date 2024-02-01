package lesson3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  Циклы

        /*
        while(УСЛОВИЕ){
            ТЕЛО ЦИКЛА;
        }
        ИТЕРАЦИЯ - 1 шаг цикла
        */

//        int i = 0;  // переменная счётчик(counter)
//        while (i < 5){  // условие
//            System.out.println("i = " + i);
//            i++;    // шаг цикла
//        }

//        int i = 5;
//        while (i > 0){
//            System.out.println(i--);
//        }

//        int i = 1;
//        while (i <= 20){
//            System.out.print(i % 2 == 0 ? i : "\n");
//            i++;
//        }

        Scanner input = new Scanner(System.in);
//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println(sum);

//        int v, n, sum = 0;
//        int counter;
//        System.out.print("Введите нижний диапазон ");
//        n = input.nextInt();
//        counter = n;
//        System.out.print("Введите верхний диапазон ");
//        v = input.nextInt();
//        while (counter <= v){
//            if (counter % 2 != 0){
//                sum += counter;
//            }
//            counter++;
//        }
//        System.out.println(sum);


//        int n, orient;
//        String symbol;
//        System.out.print("Введите число символов: ");
//        n = input.nextInt();
//        System.out.print("Введите тип символа: ");
//        symbol = input.next();
//        System.out.print("Введите ориентацию линии \n0 - горизонт \n1 - вертикаль: ");
//        orient = input.nextInt();
//        if (orient == 0) {
//            while (n > 0) {
//                System.out.print(symbol + " ");
//                n--;
//            }
//        } else {
//            while (n > 0) {
//                System.out.println(symbol);
//                n--;
//            }
//        }

//        int a, count = 0;
//        double avrg = 0.0;
//        do {
//            System.out.print("Введите число (0 - прервать): ");
//            a = input.nextInt();
//            if (a < 0) {
//                avrg -= a;
//                count++;
//            }
//        }
//        while (a != 0) ;
//        avrg = avrg / count;
//        System.out.println("Среднее арифметическое отрицательных чисел: " + avrg);


//        int num, numCopy, numRev = 0;
//        System.out.print("Введите число: "); //321
//        num = input.nextInt();
//        numCopy = num;
//        do {
//            numRev *= 10;
//            numRev += numCopy % 10;
//            numCopy /= 10;
//        } while (numCopy > 0);
//        System.out.println(numRev);
//        System.out.println("Число " + num + (num == numRev ? " " : " не ") + "палиндром");

//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            if (i == 5) {
//                continue;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен");

//        byte i = 0;
//        while (true) {
//            i++;
//            System.out.println(i);
//        }

//        int a, b = 1;
//        System.out.print("Вводите что-то: ");
//        while (true) {
//            a = input.nextInt();
//            if (a == 0) {
//                break;
//            }
//            b *= a;
//        }
//        System.out.println("Произведение чисел равно " + b);


//        int i = 1, j;
//        while (i < 10){
//            j = 1;
//            while (j < 10){
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                } else {
//                    System.out.print("-");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < i) {
//                System.out.print(" ");
//                j++;
//            }
//            System.out.println("*");
//            i++;
//        }


//        System.out.println("Введите кол-во символов: ");
//        int a = input.nextInt();
//        for (int i = 0; i < a; i++) {
//            System.out.print("*");
//        }

//        int a;
//        System.out.print("Введите число: ");
//        a = input.nextInt();
//        for (int i = 1; i <= a; i++){
//            if (a % i == 0){
//                System.out.println("Делится на " + i);
//            }
//        }

//        int n, res = 1;
//        for ( ;true ; ){
//            System.out.print("-->");
//            n = input.nextInt();
//            res *= n;
//            if(n == 0){
//                break;
//            }
//        }
//        System.out.println("Произведение введенных чисел: " + res);

//        for (int i = 5, a = 1; i > 0; i--, a++){
//            System.out.println(a + ") Значение: " + i);
//        }

//        for (int i = 10; i <= 100; i++){
//            int f = i / 10;
//            int l = i % 10;
//            if (f == l) System.out.print(i + " ");
//        }

//        int height, width;
//        System.out.print("Введите ширину прямоугольника: ");
//        width = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        height = input.nextInt();
//        for (int i = 0; i < height; i++){
//            for (int j = 0; j < width; j++){
//                if (i == 0 || i == height - 1 || j == 0 || j == width - 1){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int n;
//        System.out.println("Введите количество звездочек на сторону: ");
//        n = input.nextInt();
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




        /*................................................................. ВЕСЬМА СЛОЖНАЯ ФИГУРА */

//        int height, width, middle;
//        System.out.print("Введите количество звездочек на высоту: ");
//        height = input.nextInt();
//        width = height * 2 - 1;     // -1 (добавим позже)
//        middle = width / 2;         // середина строки
//        for (int i = 0, left = middle, right = middle; i < height; i++, left--, right++){   // рисуем строку
//            for (int j = 0; j < width; j++){    // рисуем столбцы
//                if (j >= left && j <= right){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        int n;
//        System.out.println("Введите количество звездочек на сторону: ");
//        n = input.nextInt();
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                if (j >= i){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


        /*........................................................................................... МАССИВЫ */

//        int mas[] = new int[4];
//        mas[0] = 5;
//        mas[1] = 7;
//        mas[2] = 9;
//        mas[3] = 11;
//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println("Длина массива: " + mas.length);
//        int last = mas[mas.length - 1];
//        System.out.println("Последний индекс: " + last);
//
//        for (int i = 0; i < mas.length; i++){
//            System.out.println(mas[i]);
//        }

//        int n = 4;
//        int[] a = new int[n];
//
//        for (int i = 0; i < a.length; i++){
//            System.out.print("->");
//            a[i] = input.nextInt();;
//        }
//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }

//        int n;
//        System.out.print("Введите кол-во элементов массива: ");
//        while (true){
//            n = input.nextInt();
//            if (n < 5) {
//                System.out.println("Введите большее значение:");
//            } else {
//                break;
//            }
//        }
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i]);
//        }


//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++){
//            System.out.print("->");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i >= 0; i--){
//            System.out.println(array[i]);
//        }
//        System.out.println(Arrays.toString(array));


//        int n, sum = 0;
//        System.out.print("Введите размер массива: ");
//        n = input.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++){
//            System.out.print("->");
//            arr[i] = input.nextInt();
//            if (arr[i] < 0){
//                sum += arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Сумма отрицательных значений: " + sum);


//        System.out.print("Введите начало диапазона: ");
//        int k = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        int n = input.nextInt();
//        int[] array = new int[n - k + 1];
//        for (int i = 0, j = k; i <= n - k; i++, j++){
//            array[i] = j;
//            System.out.print(array[i] + " ");
//        }
//        System.out.print("\n" + Arrays.toString(array));


//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length];
//        a1.clone();
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//        System.out.println("\n" + Arrays.toString(a1));
//        System.out.println("\n" +Arrays.toString(a2));



        /*.....................................................................................(MAX - MIN) + MIN */


//        double a = Math.random() * 3;     // РАНДОМ ОТ 0 ДО 3 НЕ ВКЛЮЧИТЕЛЬНО
//        System.out.println(a);
//
//        double b = Math.random() * (7 - 2) + 2;     // РАНДОМ ОТ 2 ДО 7 НЕ ВКЛЮЧИТЕЛЬНО
//        System.out.println(b);
//
//        double c = Math.random() * (5 - (-5)) + (-5);     // РАНДОМ ОТ -5 ДО 5 НЕ ВКЛЮЧИТЕЛЬНО
//        System.out.println(c);


//        double c = 0;
//        while (c != -3) {
//            c = (int) (Math.random() * (4 - (-2)) + 1 + (-2));     // РАНДОМ ОТ -5 ДО 5 ВКЛЮЧИТЕЛЬНО
//            System.out.println(c);
//        }


//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
////            array[i] = (int) (Math.random() * 11);          // от 0 до 10 (включительно)
////            array[i] = (int) (Math.random() * 13 + 2);          // от 2 до 14 (включительно)
//            array[i] = (int) Math.floor(Math.random() * 32 - 15);             // от -15 до 16 (включительно)
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = new int[20];
//        int evenCounter = 0, sumOdd = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);        // от 10 до 50 (не включительно)
//            if (array[i] % 2 == 0)  evenCounter++;
//            else sumOdd += array[i];
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Количество чётных элементов: " + evenCounter);
//        System.out.println("Сумма нечётных элементов: " + sumOdd);


//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int a: numbers) {
//            a++;
//            System.out.print(a + " ");
//        }
//        System.out.println();
//        for (int a: numbers) {
//            System.out.print(a + " ");
//        }


//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String str: names) {
//            System.out.print(str + " ");
//        }


//        String[] cities = {"Брянск", "Иркутск", "Владивосток", "Армавир"};
//        System.out.println(Arrays.toString(cities));
//        String kipr = "Кипр";
//        String[] cities2 = new String[cities.length + 1];
//        for (int i = 0; i < cities2.length; i++) {
//            if (i < 2) cities2[i] = cities[i];
//            else if (i > 2) cities2[i] = cities[i - 1];
//            else cities2[i] = kipr;
//        }
//        System.out.println(Arrays.toString(cities2));


//        ArrayList <String> cities = new ArrayList<>();
//        cities.add("Брянск");
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//
//        System.out.println(cities.get(2) + "\n");      // Получаем значение эл-та по заданному индексу
//
//        for (String city: cities) {
//            System.out.println(city + " ");
//        }
//
//        System.out.println("\n" + cities.indexOf("Владивосток") + "\n");    // Получаем индекс эл-та по заданному значению
//
//        cities.set(2, "Курск");          // Устанавливаем новое значение по заданному индексу
//
//        cities.remove("Армавир");    // Удаление по индексу лучше, т.к. по значению удалит только первый попавшийся
//
//        for (String city: cities) {
//            System.out.println(city + " ");
//        }
//
//        if (cities.contains("Курск")) {         // проверка на существование элемента в массиве
//            System.out.println("\nArrayList содержит \"Курск\"");
//        }
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i) + "   ");
//        }


//        int n, k;
//        ArrayList <Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка. Условие выхода 0 или отрицательное число:  ");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//
//        for (int m: mas) {
//            System.out.print(m + "\t");
//        }
//
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//
//        for (int m: mas) {
//            System.out.print(m + "\t");
//        }


//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for (int m: mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
//        ind = mas.indexOf(max);
//        System.out.println("index: " + ind);
//        mas.remove(ind);
//        mas.add(0, max);
//        for (int m: mas) {
//            System.out.print(m + "\t");
//        }


//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33));
//        ArrayList<Integer> c = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//        System.out.print(c);


//        int[][] num = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
//        System.out.println(num.length);         // 3
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++) {      // i = 0
//            for (int j = 0; j < num[i].length; j++) {   // j = 0
//                System.out.print(num[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] * arr[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int n = 5, m = 7;
//        char[][] graph = new char[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                graph[i][j] = '*';
//                System.out.print(graph[i][j] + "  ");
//            }
//            System.out.println();
//        }


//        int[][] arr = new int[3][4];
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 30 - 20);
//                if (arr[i][j] < 0) {
//                    counter++;
//                }
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + counter);


//        int[][] array = new int[3][5];
//        int sum = Integer.MAX_VALUE, temp = 0, n = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 100);
//                System.out.print(array[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                temp += array[i][j];
//            }
//            if (sum > temp) {
//                sum = temp;
//                n = i;
//            }
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + temp);
//            temp = 0;
//
//        }
//        System.out.println("\nСтрока с минимальной суммой элементов: " + sum + ", имеет номер " + (n + 1));


//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * (10 - (-5)) + (-5));
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }


//        int[][] mas = new int[3][];
//        mas[0] = new int[] {1, 2};
//        mas[1] = new int[] {3, 4, 5};
//        mas[2] = new int[] {6, 7, 8, 9};
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        int[][] mas1 = new int[][] {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
//        for (int i = 0; i < mas1.length; i++) {
//            for (int j = 0; j < mas1[i].length; j++) {
//                System.out.print(mas1[i][j] + "\t\t");
//            }
//            System.out.println();
//        }


//        int n = 5, counter = 10;
//        int[][] arr = new int[n][];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[arr.length-i];
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = counter++;
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }


        /*............................................................................... ТРЕУГОЛЬНИК ПАСКАЛЯ*/

        int n = 7;
        int[][] tp = new int[n][];
        for (int i = 0; i < n; i++) {
            tp[i] = new int[i + 1];
            tp[i][0] = 1;
            tp[i][i] = 1;
            for (int j = 1; j < i; j++) {
                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j];
            }
        }

        for (int i = 0; i < tp.length; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < tp[i].length; j++) {
                System.out.print(tp[i][j] + "\t\t");
            }

            System.out.println();
        }


    }
}
































