package lesson11;

public class HomeWork_20 {
    public static void main(String[] args) {
        Car car1 = new Car("X7 M50i", 2021, "BMW", 530, "white",
                10790000);
        car1.displayInfo();
    }
}

class Car{
    private String modelName;
    private int releaseYear;
    private String maker;
    private int enginePower;
    private String color;
    private int price;


    public Car(String modelName, int releaseYear, String maker, int enginePower, String color, int price) {
        this.modelName = modelName;
        this.releaseYear = releaseYear;
        this.maker = maker;
        this.enginePower = enginePower;
        this.color = color;
        this.price = price;
    }


    public void displayInfo(){
        System.out.printf("********** Данные автомобиля **********%n" +
                "Название модели: %1$s%n" +
                "Год выпуска: %2$d%n" +
                "Производитель: %3$s%n" +
                "Мощность двигателя: %4$s" + " л.с.%n" +
                "Цвет машины: %5$s%n" +
                "Цена: %6$d%n" +
                "=======================================", this.getModelName(), this.getReleaseYear(), this.getMaker(),
                this.getEnginePower(), this.getColor(), this.getPrice());
    }


    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
