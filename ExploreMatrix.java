import java.util.*;

public class ExploreMatrix
{
	
	public static void main(String[] args)
	{
		System.out.print("Enter the size of the matrix: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int[][] matrix = randomZeroOneMatrix(n);
		printTwoDArray(matrix);
		rowChecks(matrix);
		columnChecks(matrix);
		checkMajorDiagonal(matrix);
		checkSubDiagonal(matrix);
		
	}
	public static int[][] randomZeroOneMatrix(int n)
	{
		int[][] temp = new int[n][n];
		for (int row=0; row <temp.length;row++) {
			for (int columns = 0; columns < temp[row].length;columns++) { 
				temp [row][columns] = (int)(Math.random()*2);
				//System.out.print(temp[row][columns]+"");
			}
			//System.out.println("");
		}
	
		return temp; // stub
	}
	public static void printTwoDArray(int[][] array) {
		for (int row=0; row <array.length;row++) {
			for (int columns = 0; columns < array[row].length;columns++) { 
				System.out.print(array[row][columns]+"");
			}
			System.out.println("");
			}
		
		}
	public static void rowChecks(int[][] matrix)
	// Check which rows have all of the same entries.
	// Display a message for each such row.
	// Display a different message if none of the rows
	// have all the same entries.
	// Precondition:  none of the entries are -1.
{
	for (int i = 0; i < matrix.length; i++){
		int binaryNumber = checkRowForSameness( matrix,  i);
		
				System.out.println("Rows"+i+"have all matxhing numbers"+ "s. ");
	}
}


	public static void columnChecks(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++){
			int binaryNumber = 0;
			for (int j =1; j<matrix.length; j++)
				 binaryNumber = checkColumnForSameness(matrix,j);
				
				
					System.out.println("Colum"+i+"have all matching numbers" + "s. ");
		}
		
	}	
	public static int checkRowForSameness(int[][] matrix, int i)
	{
		int temp = matrix[i][0];
		int binaryCounter = 1;
		for (int j =1; j<matrix.length; j++)
			if (temp == matrix[i][j]) {
			binaryCounter++; 
			
			}
			else 
		binaryCounter = -1; // stub
	 return binaryCounter;
}
	public static int checkColumnForSameness(int [][] matrix, int j) {
		int temp = matrix[0][j];
		int binaryCounter = 1;
		for (int i =1; i<matrix.length; i++)
			
			if (temp == matrix[i][j])
				binaryCounter++;
			else 
				binaryCounter = -1;
		return binaryCounter;
	}
	public static void checkMajorDiagonal(int[][] matrix)
	{
		int temp = matrix[0][0];
		int binaryCounter = 1;
		for (int j = 1; j<matrix.length;j++)
			if (temp == matrix[j][j])
				temp++;
			else
					temp = 0;
				
		System.out.println("checkMajorDiagonal stub" + temp);
	}
public static void checkSubDiagonal(int[][] matrix)
	
	{
	int temp = matrix[matrix.length-1][matrix.length -1];
	for (int j = 1; j < matrix.length;  j++ )
		if (temp==matrix[j][j])
			temp ++;
		else
			temp = 0;
	
		System.out.println("checksubDiagonal stub"+ temp);
	}
}
	
	