package lesson13.homeWork_23;

class Triangle extends Figure{
    protected Triangle(int side1, int side2){
        super(side1, side2);
    }

    @Override
    protected void printArea(){
        System.out.println("Площадь треугольника: " + area());
    }

    @Override
    protected double area(){
        return (double)(getSide1() * getSide2()) / 2;
    }
}
