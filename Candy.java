
public class Candy extends DessertItem {
private int pounds;
private double cent;
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	public Candy(String name,int pounds,double cent) {
		super.name=name;
		this.pounds=pounds;
		this.cent=cent;
	}
	public double getCost() {
		return super.cost=pounds * cent;
		
	}
	
	public void cost(int pounds) {
		this.pounds = pounds;
	}
}

