package afternoon;

public class PqrBank extends BaseBank implements AtmCard {

    @Override
    public void withdraw(int amt) {
        balance -= amt;
        System.out.println("PQR: Withdrawing Amt " + amt);
    }

    @Override
    public void deposit(int amt) {
        balance += amt;
        System.out.println("PQR: Deposit Amt " + amt);
    }

    @Override
    public int balance() {
        System.out.println("PQR: Balance " + balance);
        return balance;
    }
}
