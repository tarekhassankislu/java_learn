package adwell;

public class Admin extends Employee{
	
	private String qualifications;

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public Admin(int id_no, String name, String star, int fax_no, String qualifications) {
		super(id_no, name, star, fax_no);
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "Admin [id_no=" + getId_no() + ", name=" + getName() + ", Star=" + getStar() + ", fax_no=" + getFax_no() + ", qualifications=" + qualifications + "]";
	}
	
	public static void main (String args[]) {
		Admin admin = new Admin(9999,"admin1", "2/2/2000", 5678998, "BBA");
		System.out.println(admin);
	}
	

}
