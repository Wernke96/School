import java.text.DecimalFormat;
public class DessertItem {
protected String name;
protected double cost;
DecimalFormat df = new DecimalFormat("##.##");

	public DessertItem() {
		// TODO Auto-generated constructor stub
	}
	public DessertItem(String name) {
	this.name=name;
	
	}
	public double getCost() {
		
	return cost;
	
	} 
	String getName() {
		return name;
	}
	 
	public String toString() {
		return String.format("%s %s",getName(),df.format(getCost()));
	}
	public void cost(int i) {
		
	}

}

