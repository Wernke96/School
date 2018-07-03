import java.util.Scanner;
public class Testscores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in a number for how many scores you are entering: ");
		int numlist = input.nextInt();
		int[] testlist = new int [numlist];
		double sum = 0;
		for (int i = 0; i < numlist;i++) {
			System.out.println("please enter your number you got on the test: ");
		    testlist[i] = input.nextInt();
		    sum += testlist[i];
		    
		}
	double average = sum/numlist;
	for (int j = 0; j < testlist.length;j++) {
		if (testlist[j]<average)
		 System.out.println("This test score is below the average: " + testlist[j]);
		else if (testlist[j]==average)
			System.out.println("This is equal to the average: " + testlist[j]);
		else if (testlist[j] > average)
			System.out.println("This score is above the average: " + testlist[j]);
	}
	}
}
