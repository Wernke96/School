

public class Rational {
private int num;
private int den;

Rational (){
	this(0,1);
}

Rational (int num, int den){
this.num = num;
this.den = den;
if (den < 0) {
	this.den = den * -1;
   this.num = num * -1;
}
  if (den == 0) {
	  this.num = 0;
	  this.den = 0;
  }
  reduce();
}

 public String toString() {
	  return String.format("%s %s %s", num,"/",den);
  }
 int compareTo(Rational other) { 
	 
	 	
	this.num = num * den;
	 this.den = den * den;
	 if (num < 0 && den < 0) 
		 return 0;
	 if (num > 0 && den >0 )
		return 1 ;
	return den;
	
	
		
	 
	 
 }
public Rational add(Rational other){
	int n = num * other.den + other.num * den;
	int d = den * other.den;
	return new Rational (n,d);
	
	
}
public Rational subtract(Rational other) {
	int n = num * other.den - other.num * den ;
	int d = den * other.den;
	return new Rational(n,d);
	
}
public Rational multiply(Rational other) {
	int n = num * other.den * other.num * den ;
	int d = den * other.den;
	return new Rational(n,d);
}
public Rational divide(Rational other) {
	int n = num * other.den / other.den * den;
	int d = den * other.den;
	return new Rational (n,d);
}
private void reduce() {
	int divisor = 2; 
	if (num == 0)
		den = 1;
	else {
		while (divisor < num||divisor <den ) {
			if (num % divisor == 0 && den % divisor == 0 ) {
				this.num = num / divisor;
				this.den = den / divisor;
			}
				else 
					divisor++;
			
		}
	}
}
}

	
	

