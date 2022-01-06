package test_constructor;

public class main {
	
	public static void main (String args[]) {
	Account acc = new Account("123456789879", "Account Info", 1000, "100101");
	System.out.println(acc);	
	Transaction tran = new Transaction();
	tran.withdraw(acc, 600);
	System.out.println(tran);
	tran.deposit(acc, 500);
	System.out.println(tran);
	}
}
