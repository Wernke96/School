import java.util.*;
 import java.text.DecimalFormat;
public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		int indexD ;
		int howMuch;
		double ar = 0; 
		// TODO Auto-generated method stub[0]
		System.out.println("Here how menu");
		DessertItem [] addmenu = new DessertItem[10];
		addmenu[0] = new Candy("Reece's Pieces",1,3.99);
		addmenu[1] = new Candy("Chocalate cover rasins",1,3.99);
		addmenu[2] = new cookies("Peanut Butter",12,5.99);
		addmenu[3] = new cookies("Chocolate Chip",12,4.99);
		addmenu[4] = new cookies("Sugar",12,4.50);
		addmenu[5]= new iceCream("Cookie Dough",1,3);
		addmenu[6]= new iceCream("Vanilla",1,2);
		addmenu[7]= new iceCream("Carmel",1,3.5);
		addmenu[8]= new Candy("Kikat",1,2.99);
		addmenu[9]=new Candy("reece's kiss",1,1.99);
	     int  item = 0;
		for (int i = 0; i < addmenu.length;i++) {
		System.out.print("Item Number "+ (item)+"   ");
		System.out.println(addmenu[i].toString());
		item++;
		}
		
		System.out.println("How many Item would you like ");
		int numberItems = in.nextInt();
		
		int count = 0;
		do {
		
		
		System.out.print("Please type the number of the item would you like and how much you would like");
		 indexD = in.nextInt();
		 howMuch = in.nextInt();
		
		
		for (int i = 0; i < addmenu.length;i++) {
		
			if (indexD == i) {
				addmenu[i].cost(howMuch);
				ar = ar + addmenu[i].getCost();
			    System.out.println("This is how much it will cost  " + addmenu[i].toString());
			    count++;
			}
		}
		}while(count < numberItems);
	
	System.out.print("This is how much everything is " + df.format(ar));
			
	}
	

}