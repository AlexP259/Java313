package lesson13.shape;

public class Rectangle extends Figure{
    private int width;
    private int length;

    public Rectangle(int width, int length, String color){
        super(color);
//        this.width = width;
//        this.length = length;
        setWidth(width);
        setLength(length);
    }

    public int area(){
        return this.width * this.length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width < 0){
            throw new IllegalArgumentException("Необходимо задать положительное число");
        }
        this.width = width;
    }

    public int getLength() {
        if(length > 0){
            this.length = length;
        } else {
            System.out.println("Необходимо задать положительное число");
        }
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
