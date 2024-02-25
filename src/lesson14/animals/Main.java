package lesson14.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Герда");
        animals[1] = new Dog("Том");
        for (Animal anim: animals) {
            anim.makeSound();
            anim.sleep();
        }


    }
}


abstract class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void sleep(){
        System.out.println(this.name + " спит!");
    }
}


class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает!");
    }
}


class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает!");
    }
}











