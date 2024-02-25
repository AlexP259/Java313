package practics.practics_17.exercise_4;

public class Rectangle extends Figure{
    private int sideA, sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }


    @Override
    public double area(){
        return getSideA() * getSideB();
    }
}
