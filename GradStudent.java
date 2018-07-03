
public class GradStudent extends Student {
	public GradStudent() {
		super("", "", 0, 0); // ,ss,studentCredit,Qp);
	}

	public GradStudent(String name,String ssn,int hours,int qp) {
		super(name,ssn,hours,qp);
		
	}
	
	public boolean qualifiedForScoholorship() {
	
		return (gpa() >= 3.0 && super.studentCredit >= 35);
		
	}

}
