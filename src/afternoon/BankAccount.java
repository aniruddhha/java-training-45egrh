package afternoon;

public abstract class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0; // default
    }

    public BankAccount(int b) {
        balance = b; // paramaterized
    }

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

// is a relationship
class CurrentAccount extends BankAccount { }
class SavingsAccount extends BankAccount { }

// has a relationship
class BankCarLoan {
    private BankAccount ba;
    private Car car;
}

class BankAccountMain {

    public static void main(String[] args) {
//        BankAccount ba1 = new BankAccount();
//        ba1.balance = 90; // bad Idea

//        ba1.deposit(100);
//        System.out.println("Balance is = " + ba1.checkBalance());

//        BankAccount ba2 = new BankAccount();
        BankAccount ca = new CurrentAccount();
        BankAccount sa = new SavingsAccount();
    }
}
