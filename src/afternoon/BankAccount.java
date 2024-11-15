package afternoon;

public class BankAccount {

    private int balance;

    private int calculateSmsCharges() {
        return 0;
    }

    public void deposit(int amt) {;

        calculateSmsCharges();

        balance += amt;
    }

    public void withdraw(int amt) {
        balance -= amt;
    }

    public int checkBalance() {
        return balance;
    }
}

class BankAccountMain {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
//        ba1.balance = 90; // bad Idea

        ba1.deposit(100);
        System.out.println("Balance is = " + ba1.checkBalance());
    }
}
