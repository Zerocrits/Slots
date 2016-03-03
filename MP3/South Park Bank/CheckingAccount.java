/**
 * Class that extends BankAccount to model a checking account.
 */
public class CheckingAccount extends BankAccount
{
	private int transactionCount;
	private static final int NUM_FREE = 3;
	private static final double TRANS_FEE = 2.0;

	/** Constructor - Initializes the transaction count to zero */
	public CheckingAccount()
	{

	}

	/** Set the account holder name for this bank account
	*	and initialize the transaction count to zero */
	public CheckingAccount(String accountHolder)
	{

	}

	/** Deposits an amount into this acount
	*	and increments the transaction count */
	public void deposit(double amount)
	{

	}

	/** Withdraws an amount from this account
	*	and increments the transaction count */
	public void withdraw(double amount)
	{

	}

	/** Deducts fees based on the number of transactions over the 'allowed'amount (NUM_FREE)
	*	and the Transaction Fees (TRANS_FEE) for this account
	*	Note: Once fees are deducted, the transaction count should be set back to zero
	*/
	public void deductFees()
	{

	}
}
