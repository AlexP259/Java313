package lesson16.dog;

public class DogIsNotReadyException extends Exception{
    public DogIsNotReadyException(String message) {
        super(message);
    }

}
