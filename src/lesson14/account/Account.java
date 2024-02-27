package lesson14.account;

public interface Account {
    void deposit(double amount);

    void withDraw(double amount);

    double getBalance();
}
