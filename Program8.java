import java.util.Scanner;
import java.text.DecimalFormat;
public class Program8 {
public static void main(String[]args) {
	DecimalFormat df = new DecimalFormat();
	df = new DecimalFormat("##.##");
	Scanner input = new Scanner(System.in);
	int [] arr;
	int num;
	System.out.print("Please type a number between 0 to 100:  ");
	num = input.nextInt();
	if (num <0||num > 100) {
		System.out.println("Error");
		System.exit(0);
	}
	arr = getArray(input,num);
      double average = getAvg(arr);
      double stddev = getStdDev(arr);
      boolean sorted = isArraySorted(arr,num);
      int a = determineavg(arr,average);
      System.out.println("average: " + average);
      System.out.println("std dev: " + df.format(stddev));
      System.out.println("less than average: " + a);
      if (sorted)
    	  System.out.println("Array is");
      else 
    	  System.out.println("array is not");
     
      
}

public static int [] getArray(Scanner input,int size) {
	int [] temp = new  int[size];
	System.out.print("Please input the next line:   ");
	for (int i = 0; i<size;i++) {
		temp [i] = input.nextInt();
		}
	return temp;
}
 public static double getAvg(int[] values) {
	int sum = 0;
	for ( int i =0; i<values.length; i++) {
		sum += values[i];
		}
	
	return (double)sum/values.length;
	
 }
 public static double getStdDev(int[] value) {
	 int n = value.length;
	 if (n <= 1) {
		 System.out.println("There should be more than 2 to get std");
			System.exit(0);
			}
	   double avg = getAvg(value);
	   double sum = 0;
	 for (int i = 0; i < value.length;i++) {
		sum += Math.pow((value[i]-avg),2); 
	 }
	 return  Math.sqrt(sum/(n -1));
	 
	 
 }
 public static boolean isArraySorted(int[] array,int num) {
	for (int i = 0; i < array.length-1; i++) {
		if (array[i]> array[i+ 1])
			return false;}
	 return true;
	
	
 }
 public static int determineavg(int[] value, double average) {
	 int a = 0;
	 for (int i = 0; i < value.length;i++) {
		 if ((double) value[i]<average)
			 a ++;
	 }
	 return a;
 }
}
/*Please type a number between 0 to 100:  5
Please input the next line:   16 25 81 80 24
average: 45.2
std dev: 32.41
less than average: 3
array is not

2.Please type a number between 0 to 100:  10
Please input the next line:   1000 1001 1111 1222 1775 1776 1777 1888 1997 1998
average: 1554.5
std dev: 417.93
less than average: 4
Array is
 3.Please type a number between 0 to 100:  1
Please input the next line:   1000
There should be more than 2 to get std

4.Please type a number between 0 to 100:  10
Please input the next line:   1 2 3 9 8 7 4 6 12 15
average: 6.7
std dev: 4.47
less than average: 5
array is not

5.Please type a number between 0 to 100:  0
Please input the next line:   There should be more than 2 to get std

6.Please type a number between 0 to 100:  20
Please input the next line:   21 3 20 5 30 1 33 14 17 18 10 4 48 50 22 25 6 47 8 19
average: 20.05
std dev: 15.1
less than average: 12
array is not
 
 7. Please type a number between 0 to 100:  10
Please input the next line:   8 7 8 7 8 7 9 8 9 7
average: 7.8
std dev: 0.79
less than average: 4
array is not


 */
