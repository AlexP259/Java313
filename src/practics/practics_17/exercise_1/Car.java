package practics.practics_17.exercise_1;

public class Car extends Device{
    public Car(String name, String description) {
        super(name, description);
    }

    @Override
    public String sound() {
        return "Машина неожиданно и протяжно сигналит";
    }
}
