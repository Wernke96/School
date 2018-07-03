import java.util.*;
public class Quadratic {
public static void main (String[] args) {
Scanner in = new Scanner(System.in);
int a; int b; int c;
double root1 = 0;
double root2;
double Discriminant;
a = in.nextInt();
b = in.nextInt();
c = in.nextInt();
Discriminant = computeDiscriminat(a, b, c);
if (Discriminant == Double.NaN) {
	System.out.println("This equation has no roots");
if (a == 0) 
System.out.println("This is not a quadratic equation");

root1 = computeRoot(Discriminant, a,b,'+');
root2 = computeRoot(Discriminant, a,b,'-');
System.out.println(root1+ "  "+root2);
}
}
public static double computeDiscriminat(int a, int b,int c){
int temp = (b*b-4*a*c);
double Discriminant = Math.sqrt(temp);
return Discriminant;


}
public static double computeRoot(double discriminant, int a, int b, char ch){
	double num, denom;
	denom = 2 * a;
	if (ch == '+') 
		num = (-b+discriminant)/(2*a); 
		else 
			num = (-b-discriminant)/(2*a); 
	return num/denom;
}
}