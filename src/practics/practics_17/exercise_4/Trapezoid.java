package practics.practics_17.exercise_4;

public class Trapezoid extends Figure{
    private int sideA, sideB, height;

    public Trapezoid(int sideA, int sideB, int height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getHeight() {
        return height;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area(){
        return (double)(getSideA() + getSideB()) / 2 * this.height;
    }

    
}
