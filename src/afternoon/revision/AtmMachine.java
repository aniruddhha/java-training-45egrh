package afternoon.revision;

public class AtmMachine {

    public void swipeForWithdraw(final AtmCard card, int amt) {
        card.withdraw(amt);
        System.out.println("After Withdraw Balance is " + card.balance());
    }

    public void swipeForDeposit(final AtmCard card, int amt) {
        card.deposit(amt);
        System.out.println("After Deposit Balance is " + card.balance());
    }

    public void swipeForBalance(final AtmCard card) {
        System.out.println("Available Balance is " + card.balance());
    }
}
