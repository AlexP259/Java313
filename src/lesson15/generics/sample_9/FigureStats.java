package lesson15.generics.sample_9;

public class FigureStats <FigureType extends Figure>{
    FigureType[] arr;

    public FigureStats(FigureType[] arr) {
        this.arr = arr;
    }

    public double getSumArea(){
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += this.arr[i].getArea();
        }
        return result;
    }

    public double getMaxArea(){
        double maxArea = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxArea < arr[i].getArea()) {
                maxArea = arr[i].getArea();
            }
        }
        return maxArea;
    }

    public double getMinArea(){
        double minArea = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minArea > arr[i].getArea()) {
                minArea = arr[i].getArea();
            }
        }
        return minArea;
    }


}
