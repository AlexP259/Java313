package lesson11.rect;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        if(length > 0){
            this.length = length;
        } else {
            System.out.println("\"" + length + "\" должно быть положительным числом");
        }
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        } else {
            System.out.println("\"" + width + "\" должно быть положительным числом");
        }
    }
    public int getArea(){
        return this.length * this.width;
    }
    public int getPerimetr(){
        return (this.length + this.width) * 2;
    }
    public double getHypotenuse(){
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }
    public void getDraw(){
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
