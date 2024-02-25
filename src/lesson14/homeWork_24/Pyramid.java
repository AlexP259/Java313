package lesson14.homeWork_24;

public class Pyramid extends Figure3d{
    private double baseSideA, baseSideB, baseSideC, height;

    {
        this.setName("пирамида");
    }

    public Pyramid(double baseSideA, double baseSideB, double baseSideC, double height) {
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.baseSideC = baseSideC;
        this.height = height;
    }

    public double getBaseSideA() {
        return baseSideA;
    }
    public double getBaseSideB() {
        return baseSideB;
    }
    public double getBaseSideC() {
        return baseSideC;
    }
    public double getHeight() {
        return height;
    }

    public void setBaseSideA(double baseSideA) {
        this.baseSideA = baseSideA;
    }
    public void setBaseSideB(double baseSideB) {
        this.baseSideB = baseSideB;
    }
    public void setBaseSideC(double baseSideC) {
        this.baseSideC = baseSideC;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double volumeOfTheFigure() {
        double semiperimetr = (this.getBaseSideA() + this.getBaseSideB() + this.getBaseSideC()) / 2;
        double baseArea = Math.sqrt(semiperimetr * (semiperimetr - this.getBaseSideA()) * (semiperimetr -
                this.getBaseSideB()) * (semiperimetr - this.getBaseSideC()));
        return (1d / 3) * baseArea * this.getHeight();
    }
}
