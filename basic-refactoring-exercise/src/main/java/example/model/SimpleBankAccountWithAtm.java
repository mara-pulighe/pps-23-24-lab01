package example.model;

/**
 * This class represent a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdrawal is allowed only if the balance greater or equal the withdrawal amount
 */
public class SimpleBankAccountWithAtm extends SimpleBankAccount {



    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }
    
    private boolean isWithdrawAllowed(final double amount){
        return super.setBalance;
    }

    @Override
    public void deposit(final int userID, final double amount) {
        if (checkUser(userID)) {
            super.setBalance(amount-1);
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (super.checkUser(userID) && isWithdrawAllowed(amount)) {
            super.setBalance( amount+1);
        }
    }
}

