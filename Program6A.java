import java.util.Scanner;
public class Program6A {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer value(0 to quit):");
int value = input.nextInt();
int sum = 0;
int count = 0;
int oddcount= 0;
int target = 10;
int counttarget=0;
int targetcount = 0;
double average=0;
int max = Integer.MIN_VALUE;
while (value != 0 ) {
	if (value%2==1) {
    	oddcount++;}
    if(value == target) {
    	targetcount++;
    }
    if(value > max) {
    	max = value;
    }
    sum += value;
    System.out.print("Enter next value(0 to quite):");
    value=input.nextInt();
    count++;
    average = (double)(sum)/(double)(count);
}
if ( count == 0) {
	System.out.println("average is undefined");
}



	


System.out.println("The sum of the entered values is: " + sum);
System.out.println("the average:"+ average);
System.out.println("Inputs: "+count);
System.out.println("This is how many odd number their where: "+ oddcount);
System.out.println("This is how  many times you hit the target: "+targetcount);
System.out.println("This is your max: "+max);
}
}

