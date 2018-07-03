
public class Student {
	private String sName;
	private String ss;
	protected int studentCredit;
	private int Qp;

	Student() {
		this("John", "none", 0, 0);
	}

	Student(String sName, String ss, int studentCredit, int Qp) {
		this.sName = sName;
		this.ss = ss;
		this.studentCredit = studentCredit;
		this.Qp = Qp;

	}

	public int getHoursAttempted() {
		return studentCredit;
	}

	public double gpa() {
		if (studentCredit == 0)
			return 0.0;
		return  (Qp/studentCredit );
	}
	public boolean qualifiedForScoholorship() {
		return (gpa() >= 3.0);
		
	}
	public String toString() {
		return String.format("%s %s %s %s %s", sName,ss,studentCredit,
				gpa(),qualifiedForScoholorship());
	}
}
