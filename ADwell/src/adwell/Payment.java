package adwell;

public class Payment {
	private int invoice;
	private String invoice_date;
	private String amount;
	
	public int getInvoice() {
		return invoice;
	}
	public void setInvoice(int invoice) {
		this.invoice = invoice;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
	public Payment(int invoice, String invoice_date, String amount) {
		super();
		this.invoice = invoice;
		this.invoice_date = invoice_date;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [invoice=" + invoice + ", invoice_date=" + invoice_date + ", amount=" + amount + "]";
	}
	
	
	
}
