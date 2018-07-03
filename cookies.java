
public class cookies extends  DessertItem{
private int dz;
private double cents;
	public cookies() {
		// TODO Auto-generated constructor stub
	}
	public cookies(String name,int dz,double cents) {
	super.name=name;
	this.dz=dz;
	this.cents=cents;
		
	}
	public double getCost() {
		return super.cost = (dz*cents)/ 12;
	}
	public void cost(int dz) {
		 this.dz = dz;
	}
		
		
	}

