import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of  matrix");

		System.out.println("Enter the row size");
		int m = sc.nextInt();

		System.out.println("Enter the column size");
		int n = sc.nextInt();

		int[][] arr1 = new int[m][n];
		int[][] arr2 = new int[m][n];
		
		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 1st matrix ");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{
				
				arr1[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 2nd matrix ");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{
				
				arr2[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		
		
		int[][] sum = new int[m][n];
		
		for(int i=0; i<m;i++)
		{
			for(int j =0; j<n; j++)
			{
				
				 sum[i][j] = arr1[i][j] + arr2[i][j];
				
			}
			
		}
		
		
		for(int i=0; i<m;i++)
		{
			for(int j =0; j<n; j++)
			{
				
				 System.out.print(sum[i][j] + " ");   	
			}
			System.out.println();
		}
		

		
		
	}

}
