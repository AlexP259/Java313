package lesson16.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лексус");

        dog.putCollar();
        dog.putLeash();
//        dog.putMuzzle();

        try{
            dog.walk();
        } catch (DogIsNotReadyException e){
            System.out.println(e.getMessage());
            System.out.println("\nПроверяем снаряжение!\nОшейник надет: " + dog.isCollarPutOn +
                    "\nПоводок надет: " + dog.isLeashPutOn +
                    "\nНамордник надет: " + dog.isMuzzlePutOn);
        }

    }
}
