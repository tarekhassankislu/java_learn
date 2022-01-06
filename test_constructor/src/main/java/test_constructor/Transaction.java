package test_constructor;

import java.util.Date;

public class Transaction {
	
	private Account account;
	private double amount;
	private Date transaction_date;
	private String type;
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void deposit (Account acc, double amount) {
		setType ("Deposit");
		setTransaction_date(new Date());
		setAmount (amount);
		setAccount(acc);
		acc.deposit(amount);	
	}
	public void withdraw (Account acc, double amount) {
		setType ("Withdraw");
		setTransaction_date(new Date());
		setAmount (amount);
		setAccount(acc);
		acc.withdraw(amount);	
	}
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(Account account, double amount, Date transaction_date, String type) {
		super();
		this.account = account;
		this.amount = amount;
		this.transaction_date = transaction_date;
		this.type = type;
	
	}
	@Override
	public String toString() {
		return "Transaction [account=" + account + ", amount=" + amount + ", transaction_date=" + transaction_date
				+ ", type=" + type + "]";
	}
	
	/*public static void main(String args[]) {
		Date date = new Date();
		System.out.println(date);*/
				
		
		
	}
	

