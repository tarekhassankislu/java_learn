package adwell;

public class Advertise {
	private String tittle;
	private double estimated_cost;
	private double actual_cost;
	private String target_date;
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public double getEstimated_cost() {
		return estimated_cost;
	}
	public void setEstimated_cost(double estimated_cost) {
		this.estimated_cost = estimated_cost;
	}
	public double getActual_cost() {
		return actual_cost;
	}
	public void setActual_cost(double actual_cost) {
		this.actual_cost = actual_cost;
	}
	public String getTarget_date() {
		return target_date;
	}
	public void setTarget_date(String target_date) {
		this.target_date = target_date;
	}
	public Advertise(String tittle, double estimated_cost, double actual_cost, String target_date) {
		super();
		this.tittle = tittle;
		this.estimated_cost = estimated_cost;
		this.actual_cost = actual_cost;
		this.target_date = target_date;
	}
	@Override
	public String toString() {
		return "Advertise [tittle=" + tittle + ", estimated_cost=" + estimated_cost + ", actual_cost=" + actual_cost
				+ ", target_date=" + target_date + "]";
	}
	
	
	
}
