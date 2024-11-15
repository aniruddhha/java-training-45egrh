package morning;

public abstract class BanAccount {

    private Car c;
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

//        morning.BanAccount ac1 = new morning.BanAccount();
//        ac1.deposit(1000);
//        System.out.println("Balance " + ac1.checkBalance());;

//        morning.BanAccount ac2 = new morning.BanAccount(1000);

        BanAccount ac3 = new CurrentAccount();
        BanAccount ac4 = new SavingAccount();
//        morning.BanAccount ac5 = new morning.BanAccount();
    }
}

class CurrentAccount extends BanAccount { }

class SavingAccount extends BanAccount { }
