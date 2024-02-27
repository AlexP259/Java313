package lesson14.homeWork_25;

public class Rectangle implements Resize{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        setWidth(width);
    }

    @Override
    public void resizeHeight(int height) {
        setHeight(height);
    }

    public void info(){
        System.out.println("Width: " + getWidth() + ", Height: " + getHeight());
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
