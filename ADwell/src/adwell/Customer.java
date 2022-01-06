package adwell;

public class Customer {
	private int id_no;
	private String name;
	private String address;
	private int fax_no;
	
	//getset
	public int getId_no() {
		return id_no;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getFax_no() {
		return fax_no;
	}
	public void setFax_no(int fax_no) {
		this.fax_no = fax_no;
	}
	//tostring
	@Override
	public String toString() {
		return "Customer [id_no=" + id_no + ", name= " + name + ", address= " + address + ", fax_no=" + fax_no + "]";
	}
	public Customer(int id_no, String name, String address, int fax_no) {
		super();
		this.id_no = id_no;
		this.name = name;
		this.address = address;
		this.fax_no = fax_no;
	}
	
	//print/display
	public static void main(String args[]) {
		
		Customer cstr = new Customer(1001, "kislu", "mirpur", 1697456431);
		
		System.out.println(cstr);
	}

}
