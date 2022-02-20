import java.util.Scanner;

public class MatrixMultiplication {

	static void toMultiply(int mat1[][], int mat2[][])
	{
		int[][] mat3 = new int[mat1.length][mat1[0].length];

		for(int i=0; i<mat1.length;i++) 
		{
			for(int j=0;j<mat1[i].length;j++)
			{

				mat3[i][j] =0;

				for(int k=0;k<mat1.length;k++)
				{
					mat3[i][j] += mat1[i][k] * mat2[k][j];
				}

				System.out.print(mat3[i][j]+ " ");
			}

			System.out.println();
		}
	}


	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of  matrix");

		System.out.println("Enter the row size");
		int m = sc.nextInt();

		System.out.println("Enter the column size");
		int n = sc.nextInt();

		int[][] mat1 = new int[m][n];
		int[][] mat2 = new int[m][n];

		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 1st matrix");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{

				mat1[i][j] = sc.nextInt();
			}
		}


		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 2nd matrix");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{

				mat2[i][j] = sc.nextInt();
			}
		}

//		int[][] mat3 = new int[m][n];
//
//		for(int i=0; i<m;i++) 
//		{
//			for(int j=0;j<n;j++)
//			{
//
//				mat3[i][j] =0;
//
//				for(int k=0;k<m;k++)
//				{
//					mat3[i][j] += mat1[i][k] * mat2[k][j];
//				}
//
//				System.out.print(mat3[i][j]+ " ");
//			}
//
//			System.out.println();
//		}
		
		toMultiply(mat1,mat2);
		

	}

}
