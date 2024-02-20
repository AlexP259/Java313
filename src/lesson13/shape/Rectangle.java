package lesson13.shape;

class Rectangle extends Figure{
    private int width;
    private int length;

//    {
//        color = "blue";   / не сработает т.к. color имеет модификатор private
//    }

    public Rectangle(int width, int length, String color){
        super(color);
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
        return length;
    }

    public void setLength(int length) {
        if (length > 0){
            this.length = length;
        } else {
            System.out.println("Необходимо задать положительное число");
        }
    }
}
