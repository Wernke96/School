
public class lawStudent extends Student  {
	
 private int lsat;
 
	public lawStudent() {
	
		super("", "", 0, 0);
	}
	public lawStudent(String name,String ssn,int hours,int qp,int lsat) {
		
		super(name,ssn,hours,qp);
		this.lsat = lsat;
		
	}
	
 public boolean qualifiedForScoholorship() {
	
		return(gpa() <= 3.0 && studentCredit >= 35 && lsat >= 150);
	}
	
}
