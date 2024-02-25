package practics.practics_17.exercise_1;

public class Microwave extends Device{
    public Microwave(String name, String description){
        super(name, description);
    }

    @Override
    public String sound(){
        return "Микроволновка неожиданно звенькает";
    }
}
