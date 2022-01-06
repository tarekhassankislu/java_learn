package adwell;

public class Website {
	private String provider;
	private String start_date;
	private String end_date;
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public Website(String provider, String start_date, String end_date) {
		super();
		this.provider = provider;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Website [provider=" + provider + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	
	
}
