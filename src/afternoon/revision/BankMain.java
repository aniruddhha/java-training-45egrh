package afternoon.revision;

import java.util.Scanner;

public class BankMain {

    private static void simpleDemo() {
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

    private static void xyzBankMenu() {

        AtmCard xyzBankCard = new XyzBank();
        AtmMachine machine = new AtmMachine();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("🌐 Easy Banking Solution 🌐 ");
            System.out.println("🚀 Enter Your Choice : ");
            int ch = sc.nextInt();
            if( ch == 4) System.exit(0);
            else if (ch == 1) {
                System.out.println("\n Withdrawing");
                System.out.println("👉 Enter withdraw amount : ");
                int amt = sc.nextInt();
                machine.swipeForWithdraw(xyzBankCard, amt);
            } else if(ch == 2) {
                System.out.println("\n Depositing");
                System.out.println("👉 Enter Deposit amount : ");
                int amt = sc.nextInt();
                machine.swipeForDeposit(xyzBankCard, amt);
            }
            else if(ch == 3) {
                System.out.println("\n Balance ");
                machine.swipeForBalance(xyzBankCard);
            }
        }
    }

    public static void main(String[] args) {
        xyzBankMenu();
    }
}
