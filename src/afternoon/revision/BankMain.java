package afternoon.revision;

public class BankMain {

    public static void main(String[] args) {
        AtmMachine machine = new AtmMachine();

        AtmCard cardAbc = new AbcBank();
        machine.swipeForBalance(cardAbc);
        machine.swipeForDeposit(cardAbc, 1000);
        machine.swipeForWithdraw(cardAbc, 500);

        AtmCard cardPqr = new PqrBank();
        machine.swipeForBalance(cardPqr);
        machine.swipeForDeposit(cardPqr, 5000);
        machine.swipeForWithdraw(cardPqr, 3000);

        AtmCard cardXyz= new XyzBank();
        machine.swipeForBalance(cardXyz);
        machine.swipeForDeposit(cardXyz, 3000);
        machine.swipeForWithdraw(cardXyz, 300);
    }
}
