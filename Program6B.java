import java.util.Scanner;
public class Program6B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is the biggest whole number you think of:");
		int user = input.nextInt();
		System.out.println("n\t\tn^2\t\tn^3\t\tn^4");
		for (int i=1;i<=user;i++) {
			int secp = (int)Math.pow(i,2);
			int third = (int)Math.pow(i, 3);
			int fourp =  (int) Math.pow(i, 4);
			
			System.out.printf("%2d\t\t%4d\t\t%4d\t\t%4d\n", i ,secp, third, fourp);
			
			
			
			
		}
		
}
}