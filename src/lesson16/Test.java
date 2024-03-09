package lesson16;

public class Test {
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
            compute(5);
        } catch (NewException e){
            System.out.println("Перехваченное исключение. " + e);
        }
        System.out.println("Код дальше");
    }

    public static void compute(int a) throws NewException{
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10){
            throw new NewException(a, "Какое-то сообщение");
        } else {
            System.out.println("Нормальное завершение");
        }
    }
}


class NewException extends Exception{
    private int detail;

    public NewException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "NewException(detail=" + this.detail + ", message=" + getMessage() + ")";
    }
}

