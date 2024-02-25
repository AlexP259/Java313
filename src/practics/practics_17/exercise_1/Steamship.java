package practics.practics_17.exercise_1;

public class Steamship extends Device{
    public Steamship(String name, String description) {
        super(name, description);
    }

    @Override
    public String sound() {
        return "Пароход гудит, детишки обсираются";
    }
}
