package afternoon.revision;

public class XyzBank extends BaseBank implements AtmCard {

    @Override
    public void withdraw(int amt) {
        balance -= amt;
        System.out.println("XYZ: Withdrawing Amt " + amt);
    }

    @Override
    public void deposit(int amt) {
        balance += amt;
        System.out.println("XYZ: Deposit Amt " + amt);
    }

    @Override
    public int balance() {
        System.out.println("XYZ: Balance " + balance);
        return balance;
    }
}
