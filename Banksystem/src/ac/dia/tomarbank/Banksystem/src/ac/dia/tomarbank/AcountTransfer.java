package ac.dia.tomarbank;

public class AcountTransfer extends Transaction {
	Account to;

	//get set here
	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}
	public void AcountTransfer ( double amount, Account by, Account to)
	{
		withdraw (amount, by);
		deposit (amount, to);
		setType("acctransfer");
		setAccount(by);
		setAccount(to);
	}
	
	

	public void display() 
	{
		System.out.println("Transaction [transaction=" + getTransactionid() + ", transactiondate=" + getTransactiondate() + ", amount=" +getAmount()+ ", type=" 
	+ getType());
	}
		
	
}
