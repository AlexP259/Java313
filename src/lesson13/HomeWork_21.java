package lesson13;

public class HomeWork_21 {
    public static void main(String[] args) {
        AreaOfTheFigures.printTriangleAreaFromHeronsFormula(3, 4, 5);
        AreaOfTheFigures.printTriangleAreaFromBaseAndHeight(6, 7);
        AreaOfTheFigures.printSquareArea(7);
        AreaOfTheFigures.printRectangleArea(2,6);

        AreaOfTheFigures.printCounterInfo();
    }
}

class AreaOfTheFigures{
    static private int counter;

    /*...............................................Методы........................................................*/
    static void printTriangleAreaFromBaseAndHeight(int base, int height){
        System.out.println("Площадь треугольника через основание и высоту (" + base + "," + height + "): " +
                triangleAreaFromBaseAndHeight(base, height));
    }
    static double triangleAreaFromBaseAndHeight(int base, int height){
        counter++;
        return base * height * 0.5;
    }

    static void printTriangleAreaFromHeronsFormula(int sideA, int sideB, int sideC){
        System.out.println("Площадь треугольника по формуле Герона (" + sideA + "," + sideB + "," + sideC + "): " +
                triangleAreaFromHeronsFormula(sideA, sideB, sideC));
    }
    static double triangleAreaFromHeronsFormula(int sideA, int sideB, int sideC){
        counter++;
        double p = (double)(sideA + sideB + sideC) / 2;     // p - semiperimeter
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    static void printSquareArea(int side){
        System.out.println("Площадь квадрата (" + side + "): " + squareArea(side));
    }
    static int squareArea(int side){
        counter++;
        return side *= side;
    }

    static void printRectangleArea(int sideA, int sideB){
        System.out.println("Площадь квадрата (" + sideA +  "," + sideB + "): " + rectangleArea(sideA, sideB));
    }
    static int rectangleArea(int sideA, int sideB){
        counter++;
        return sideA * sideB;
    }

    static void printCounterInfo(){
        System.out.println("Количество подсчетов площади: " + getCounter());
    }

    /*...............................................Геттеры........................................................*/
    static int getCounter() {
        return counter;
    }
}