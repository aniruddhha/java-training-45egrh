package afternoon;

public class AbcBank extends BaseBank implements AtmCard {

    @Override
    public void withdraw(int amt) {
        balance -= amt;
        System.out.println("ABC: Withdrawing Amt " + amt);
    }

    @Override
    public void deposit(int amt) {
        balance += amt;
        System.out.println("ABC: Depositing Amt " + amt);
    }

    @Override
    public int balance() {
        System.out.println("ABC: Balance " + balance);
        return balance;
    }
}
