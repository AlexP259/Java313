package lesson14.account;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000, 1.25);
        System.out.println("===== Сберегательный счёт =====\nПервоначальный депозит: $" + savingAccount.getBalance() +
                "\nПроцентная ставка: " + savingAccount.getInterestRate());

        CurrentAccount currentAccount = new CurrentAccount(5000, 1000);
        System.out.println("\n===== Текущий счёт =====\nПервоначальный депозит: $" + currentAccount.getBalance() +
                "\nЛимит овердрафта: $" + currentAccount.getOverdraftLimit());

        Bank bank = new Bank();
        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nВносим 100 долларов на сберегательный счёт.");
        bank.deposit(savingAccount,100);

        System.out.println("\nВносим 500 долларов на текущий счёт.");
        bank.deposit(currentAccount,500);

        System.out.println("\nСберегательный счёт и текущий счёт: ");
        bank.printAccountBalances();

        System.out.println("Снимаем 150 долларов со сберегательного счёта.\n");
        bank.withdraw(savingAccount, 150);

//        bank.withdraw(currentAccount, 6500);

        System.out.println("\nСберегательный счёт и текущий счёт: ");
        bank.printAccountBalances();

        savingAccount.applyInterest();
        System.out.println("\nПосле начисления  процентов на сберегательный счёт в течение 1 года");

        System.out.println("\nСберегательный счёт и текущий счёт: ");
        bank.printAccountBalances();

    }
}
