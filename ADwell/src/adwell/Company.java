package adwell;

public class Company {
	private String name;
	private String address ;
	private String publish_date;
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
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public Company(String name, String address, String publish_date) {
		super();
		this.name = name;
		this.address = address;
		this.publish_date = publish_date;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", publish_date=" + publish_date + "]";
	}
	
	
	
}
