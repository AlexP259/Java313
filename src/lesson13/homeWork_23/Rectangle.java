package lesson13.homeWork_23;

class Rectangle extends Figure{
    protected Rectangle(int side1, int side2){
        super(side1, side2);
    }

    @Override
    protected void printArea(){
        System.out.println("Площадь прямоугольника: " + area());
    }

    @Override
    protected double area(){
        return getSide1() * getSide2();
    }
}
