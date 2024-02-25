package lesson14.homeWork_24;

public abstract class Figure3d {
    private String name;

    public abstract double volumeOfTheFigure();
    public void displayInfo(){
        System.out.printf("Фигура: %-9s| Объём фигуры: %.2f%n", this.getName(), this.volumeOfTheFigure());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
