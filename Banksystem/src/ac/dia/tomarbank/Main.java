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
	}

}
