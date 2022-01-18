package ac.dia.tomarbank;
import java.util.Date;

public class Transaction {

	private long transactionid;
	private Date transactiondate;
	private String type;
	private double amount;
	
	Account account = new Account(); // to call account class in transaction
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	public long getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(long transactionid) {
		this.transactionid = transactionid;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public void deposit(double amount, Account ac) {
		setType ("deposit");
		setAmount(amount);
		setTransactiondate(new Date());
		ac.deposit(amount);
		ac.getTrans().add(this);
		setAccount(ac);
	}	
	
	public void withdraw(double amount, Account ac) {
		setType ("withdraw tomar account");
		setAmount(amount);
		setTransactiondate(new Date());
		ac.withdraw(amount);
		ac.getTrans().add(this);
		setAccount(ac);
	}

	@Override
	public String toString() {
		return "Transaction [transaction=" + transactionid + ", transactiondate=" + transactiondate + ", type=" + type+ ", amount=" + amount+ "]";
	}	
	
	public void display() {
		System.out.println(  getTransactionid()+" "+ getTransactiondate()+ " "+getAmount()+" "+getType());
	}  
	
}
