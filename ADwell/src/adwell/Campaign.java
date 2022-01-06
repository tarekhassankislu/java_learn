package adwell;

public class Campaign {
	private String tittle;
	private String startdate ;
	private String enddate;
	private double budget;
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Campaign(String tittle, String startdate, String enddate, double budget) {
		super();
		this.tittle = tittle;
		this.startdate = startdate;
		this.enddate = enddate;
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Campaign [tittle=" + tittle + ", startdate=" + startdate + ", enddate=" + enddate + ", budget=" + budget
				+ "]";
	}
	
	
}
