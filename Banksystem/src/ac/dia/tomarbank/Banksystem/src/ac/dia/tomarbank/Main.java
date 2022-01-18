package ac.dia.tomarbank;

public class Main {

	public static void main(String[] args) {
		
		Account acc1 = new Account();
		acc1.setAccountNo("17100");
		acc1.setTitle("\t test\t");
		acc1.setBalance(300);
		acc1.setClient("Rana");
		
		Transaction trans= new Transaction();
		trans.setTransactionid(9991);
		trans.deposit(555,acc1);
		System.out.println(trans);
		
		Transaction trans1 = new Transaction();
		trans1.setTransactionid(9992);
		trans1.withdraw(500,acc1);
	  acc1.display();
	  
	  
	 /* Account acc2 = new Account();
		acc2.setAccountNo("51000");
		acc2.setTitle("\t test\t");
		acc2.setBalance(1000);
		acc2.setClient("Robin");
		
		Transaction trans2= new Transaction();
		trans2.setTransactionid(10001);
		trans2.deposit(600,acc2);
		System.out.println(trans2);
		
		Transaction trans3 = new Transaction();
		trans3.setTransactionid(10002);
		trans3.withdraw(200,acc2);
	  acc2.display();*/
	}

}
