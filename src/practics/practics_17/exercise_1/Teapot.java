package practics.practics_17.exercise_1;

public class Teapot extends Device{

    public Teapot(String name, String description) {
        super(name, description);
    }


    @Override
    public String sound() {
        return "Чайник пронзительно свистит";
    }
}
