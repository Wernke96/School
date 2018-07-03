import java.util.*;
public class Mess {
public static void main(String[]args) {
	Scanner input = new Scanner (System.in);
	int num=0;
	int [] list = new int [5];
	int max =  0;
	while (num < 5) {
		System.out.println("Please enter a number:  ");
		list[num] = input.nextInt();
		num++;
		}
	max = list[num-1];
for (int i = 0;i <num;i++) {
	
	if (max < list[i])
		max = list[i];
	

	
}
System.out.print(max);	
}
}
/*The list array wasn’t long enough. And the reason you didn’t need a break point is that you could see this is because it was a programing error and you could see all the value go in.
2.
I insert the break point at the for loop and at the if and since the max was 0 it would accept anything below zero so I change the last num equal the max
3.You will be fixing more logic errors and it let you see long list of arrays and value as the programs run.
4.Shows the information that running though the break points.
5. in method or parameters and in the return variables 
*/