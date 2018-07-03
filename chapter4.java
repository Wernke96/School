import java.util.Scanner;

public class chapter4 {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String user;
		user = input.next();
		int range = user.length();
		int rownum = 1;
	
		for (int index = 0;  index < range; ) {
			 for (int i = 0; i < rownum; i++) {
				 char c = user.charAt(index);
				 index++;
			 	if (index >= range) { 
					System.out.println();
					System.out.print(c);
				 	break;}
			   System.out.print(c);
			 }	
			System.out.println(); 
			rownum++;
		}
		
	}
}






