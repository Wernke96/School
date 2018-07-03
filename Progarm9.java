import java.util.*;

public class Progarm9 {
	public static void main(String[] args) {
		int number;
		int[] arr = new int[20];
		number = getArray(arr);
		bubbleSort(arr,  number);
		int median = getMedian(arr, number);
		double stepsize = stepSize(arr, number);
		int common = getCommonVar(arr,number);
		System.out.println("the median: "+ median);
		System.out.println("The stepsize: "+ stepsize);
		System.out.println("the common variable: "+common);
	}

	public static int getArray(int[] arr) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.print("Please enter the number:  ");
		int temp = input.nextInt();
		while (temp != 0 && number < 20) {
			arr[number] = temp;
			number++;
			temp = input.nextInt();
		}
		input.close();
		return number;
	}
	  public static void bubbleSort(int[] list, int number) {
		    boolean needNextPass = true;
		    for (int k = 1; k < number && needNextPass; k++) {
		      needNextPass = false;
		      for (int i = 0; i < number - k; i++) {
		        if (list[i] > list[i + 1]) {
		          // Swap list[i] with list[i + 1]
		          int temp = list[i];
		          list[i] = list[i + 1];
		          list[i + 1] = temp;
		          needNextPass = true; // Next pass still needed
		        }
		      
		      }	
		    }
	  }
	public static int getMedian(int[] arr, int number) {
		int median = arr[number / 2];
		return median;

	}

	public static double stepSize(int[] arr, int number) {
		int sum = 0;
		int [] temp = new int[number];
		temp = arr;
		double step = 0;
		for (int i = 0; i < number-2; i++) {
			if (number<0) {
				return step;}
			sum = temp[i+1] - arr[i]; 
		}
		step =   (number - 1)/(sum);
		return step;

	}

	public static int getCommonVar(int[] arr, int number) {
		int maxCount = 1;
		int currentCount = 1;
		int maxValue = arr[0];
		int currentValue = arr[0];
		for (int i = 1; i <= number-1; i++) {
			if (arr[i] ==  currentValue)
				currentCount++;
				if (currentCount>maxCount) {
					maxCount = currentCount; 
					maxValue = currentValue;}
					else {
						currentValue=arr[i];
						currentCount = 1;
					}
				
			}
		return maxValue;
	}
	
}
/*
 * 1.Please enter the number:  153 100 532 100 534 154 153 100 101 153 155 100 193 154 153 0
the median: 153
The stepsize: 24.0
the common variable: 100

2. Please enter the number:  66 39 38 44 65 66 67 55 44 54 66 38 67 43 66 67 33 66 51 0
the median: 55
The stepsize: 0.0
the common variable: 38
3.Please enter the number:  10 15 19 3 7 15 4 6 19 6 15 12 9 7 15 16 10 11 8 15 21 6 15 0
the median: 11
The stepsize: -1.0
the common variable: 6


 */
