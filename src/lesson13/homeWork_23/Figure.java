package lesson13.homeWork_23;

class Figure {
    private int side1, side2;

    protected Figure(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    protected void printArea(){
        System.out.println("Площадь фигуры не определена: " + area());
    }

    protected double area(){
        return 0;
    }

    protected int getSide1(){
        return side1;
    }
    protected int getSide2(){
        return side2;
    }
}
