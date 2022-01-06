package test_constructor;

public class Account {

	private String accNo;
	private String tittle;
	private double balance;
	private String customer;
	
	
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	

	public Account()
	
	{
		accNo= "132465";
		balance= 500;
		tittle ="account info";
		customer= "nahar";
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", tittle=" + tittle + ", balance=" + balance + ", customer=" + customer
				+ "]";
	}
	

	public Account(String accNo, String tittle, double balance, String customer) {
		super();
		this.accNo = accNo;
		this.tittle = tittle;
		this.balance = balance;
		this.customer = customer;
	}
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.balance-=amount;
	}
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
	}
	
	
	
}

