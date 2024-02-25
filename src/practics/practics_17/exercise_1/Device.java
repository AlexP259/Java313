package practics.practics_17.exercise_1;

public class Device {
    private String name, description;

    public Device(String name, String description){
        this.name = name;
        this.description = description;
    }


    public void printSound() {
        System.out.println(sound());
    }

    public String sound() {
        return "Устройство " + this.name + " издаёт какой-то звук";
    }

    public void show() {
        System.out.println(this.getName());
    }

    public void desc() {
        System.out.println(this.getDescription() + "\n");
    }


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
