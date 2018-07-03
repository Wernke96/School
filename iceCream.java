
public class iceCream extends DessertItem {
private double cost;
private int scoops;
	public iceCream() {
		// TODO Auto-generated constructor stub
	}
public iceCream(String name,int scoops,double cost){
	super.name=name;
	this.scoops=scoops;
	this.cost=cost;
	
}
public double getCost() {
	return super.cost = cost*scoops;
	

}
public void cost(int scoops) {
	this.scoops  = scoops;

}
}
