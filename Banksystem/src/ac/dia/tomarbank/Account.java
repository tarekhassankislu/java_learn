package ac.dia.tomarbank;
import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String title;
	private String client;
	private double balance;
	
	ArrayList<Transaction> trans = new ArrayList<Transaction>();
	
	
	public ArrayList<Transaction> getTrans() {
		return trans;
	}
	public void setTrans(ArrayList<Transaction> trans) {
		this.trans = trans;
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
public void deposit(double amount) {
	this.balance+= amount;
}	

public void withdraw (double amount) {
	if(balance > amount)
		
	this.balance-=amount;
	
	else
		System.out.println("insufficient balance at tomar account");
}
@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", title=" + title + ", client=" + client + ", balance=" + balance
			+ ", trans=" + trans + "]";
}

public  void display() {
	
	System.out.println("Account no :"+ getAccountNo() );
	System.out.println("Title"+ getTitle()+ " Client : "+ getClient());
	System.out.println("Transaction" );
   for (Transaction transaction : trans) {    //to display transaction in account class
	transaction.display();
}

	
}


}
