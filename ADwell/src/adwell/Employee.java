package adwell;

public class Employee {
	private int id_no;
	private String name;
	private String Star;
	private int fax_no;
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
	public String getStar() {
		return Star;
	}
	public void setStar(String star) {
		Star = star;
	}
	public int getFax_no() {
		return fax_no;
	}
	public void setFax_no(int fax_no) {
		this.fax_no = fax_no;
	}
	public Employee(int id_no, String name, String star, int fax_no) {
		super();
		this.id_no = id_no;
		this.name = name;
		Star = star;
		this.fax_no = fax_no;
	}
	@Override
	public String toString() {
		return "Employee [id_no=" + id_no + ", name=" + name + ", Star=" + Star + ", fax_no=" + fax_no + "]";
	}
	
	
}


