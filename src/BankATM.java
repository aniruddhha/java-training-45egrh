public interface BankATM {

    void withdraw(int amt);

    void checkBalance();
}

class GeneralBank implements BankATM {

    @Override
    public void withdraw(int amt) {

    }

    @Override
    public void checkBalance() {

    }
}
