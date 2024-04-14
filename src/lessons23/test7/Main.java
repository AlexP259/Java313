package lessons23.test7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        new Thread(() -> customer.withdraw(1500)).start();  // создали экземпляр класса Thread, вызвали внутри метод
        // withdraw() и запустили наш поток
        new Thread(() -> customer.deposit(1000)).start(); // то же самое, но метод другой
    }
}


class Customer{
    private int amount = 1000;

    public synchronized void withdraw(int amount) {
        System.out.println("Попытка снятия ($" + amount + ") денежных средств...");
        if (this.amount < amount) {
            System.out.println("На вашем счету: $" + this.amount + ". Баланс слишком мал, ожидание депозита (вклада)");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Поток прерван: " + e);
            }
        }

        this.amount -= amount;
        System.out.println("Деньги сняты. На счету осталось: $" + this.amount);
    }

    public synchronized void deposit(int amount) {
        System.out.println("Попытка внести деньги ($" + amount + ") на депозит...");

        this.amount += amount;

        System.out.println("Деньги на депозит положены. Всего на счету: $" + this.amount);

        notify();    // будет возобновлять работоспособность всех потоков, которые были остановлены методом wait()
    }

}