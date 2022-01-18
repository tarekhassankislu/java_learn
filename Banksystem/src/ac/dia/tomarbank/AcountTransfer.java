package ac.dia.tomarbank;

public class AcountTransfer extends Transaction {
	Account to;

	//get set here
	
	
	public void AcountTransfer (Account by, Account to, double amount)
	{
		Transaction.withdraw (amount, by);
		Transaction.deposit (amount, to);
		setType("acctransfer");
		setAccount(by);
		setAccount(to);
	}
	
	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}

	public void display() 
	{
		System.out.println("Transaction [transaction=" + getTransactionid() + ", transactiondate=" + getTransactiondate() + ", amount=" +getAmount()+ ", type=" 
	+ getType()+ " ,from" +by+ ", to"+ getTo() ]";);
	}
		
	
}
