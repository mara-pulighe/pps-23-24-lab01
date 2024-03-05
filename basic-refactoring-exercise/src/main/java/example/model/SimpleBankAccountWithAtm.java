package example.model;


/**
 * This class represent a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdrawal is allowed only if the balance greater or equal the withdrawal amount
 */
public class SimpleBankAccountWithAtm extends SimpleBankAccount {

    private static int FEE = 1;



    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }
    


    @Override
    public void withdraw(int userID, double amount) {
        double newamunt = amount + FEE;
        super.withdraw(userID, newamunt);
    }

    @Override
    public void deposit(int userID, double amount) {
        double newamount = amount - FEE;
        super.deposit(userID, newamount);
    }
}

