import java.io.*;
import java.util.*;

public class Program11 {
	public static void main(String[]args)  throws IOException{
	
	String [][] data = input("input1.txt");
	process("input2.txt",data);	
	output("output2.txt",data);
		
	
	}

	public static void output(String f3, String[][] table)throws IOException {
		PrintWriter pw = new PrintWriter(new File(f3));
		for (int i = 0; i <table.length;i++) {
			for(int j = 0; j<table[j].length;j++) {
				pw.print(table[i][j]+ "\t" );
			}
		pw.println();
		}
		pw.close();
	}

	public static void process(String f2, String[][] table) throws IOException{
	Scanner input = new Scanner(new File(f2));
	int count = 0;
	int row;
	int column;
	int error =0;
	String s1;
	String s2;
	while (input.hasNext()) {
		row = input.nextInt();
		column = input.nextInt();
		s1 = input.next();
		s2 = input.next();
		count++;
		if (table[row][column].equals(s1))
			table [row][column]=s2;
		else
			error+= 1;
	}
	System.out.print(f2+ " how lines were counted:  "+ count + " how many errors:  " + error);
	input.close();
	}
	

	public static String[][] input(String t) throws IOException{
		Scanner in = new Scanner(new File (t) );
		int rows = in.nextInt();
		int columns = in.nextInt();
		String[][] table = new String[rows][columns];
		for (int i = 0;i<table.length;i++)
			for (int j = 0; j<table[i].length;j++)
				table[i][j]=in.next();
		in.close();
		
		return table;
	}
	
}
/*test2.txt how lines were counted:  7 how many errors:  3
 * black	red	white	blue	orange	
Cardinals	Mets	Pirates	Reds	Brewers	
first	second	sixth	fourth	fifth	
Zappa	Howe	Hackett	Metheny	Latimer	
up	down	left	right	out	
Anderson	Cheviot	Covington	Delhi	Highland_Heights	
Grateful_Dead	Genesis	Phish	Van_der_Graaf_Generator	Yes	
ear	eyelid	mouth	nose	throat	

2. input2.txt how lines were counted:  37 how many errors:  7

Cincinnati	Temple	SMU	Connecticut	
North_Carolina	Florida_State	Duke	Miami	
Dayton	VCU	St_Joseph	Davidson	
Villanova	Xavier	Georgetown	Seton_Hall	
Ohio_State	Indiana	Maryland	Wisconsin	
Kansas	Oklahoma	Kansas_State	Oklahoma_State	
Middle_Tennessee	Louisiana_Tech	Florida_Atlantic	Texas_El_Paso	
Northern_Kentucky	Valparaiso	Oakland	Wright_State	
Northern_Illinois	Toledo	Akron	Buffalo	
Arizona	Arizona_State	UCLA	Utah	
Kentucky	Texas_A_M	Mississippi	South_Carolina	
Gonzaga	San_Diego	Brigham_Young	Santa_Clara
 */

