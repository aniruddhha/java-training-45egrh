public class BanAccount {

    protected int balance;

    // Constructor
    BanAccount() {
        balance = 0;
    }

    BanAccount(int b) {
        balance = b;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        balance -= amt;
    }

    public int checkBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BanAccount ac1 = new BanAccount();
        ac1.deposit(1000);
        System.out.println("Balance " + ac1.checkBalance());;

        BanAccount ac2 = new BanAccount(1000);

        BanAccount ac3 = new CurrentAccount();
        BanAccount ac4 = new SavingAccount();
        BanAccount ac5 = new BanAccount();
    }
}

class CurrentAccount extends BanAccount { }

class SavingAccount extends BanAccount { }
