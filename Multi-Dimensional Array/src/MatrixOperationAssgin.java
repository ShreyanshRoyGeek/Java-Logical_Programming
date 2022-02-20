import java.util.Scanner;

public class MatrixOperationAssgin {
	
	static void toReverseTheDiagonal(int mat[][])
	{
		
		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0; j<mat[i].length;j++)
			{
				
				if(i == j )
				{
					int temp = mat[i][j];
					mat[i][j] = mat[mat.length-1-i][mat[i].length-1-j];
					mat[mat.length-1-i][mat[i].length-1-j] = temp;
				}
				
				if(i+j == mat.length-1)
				{
					int temp = mat[i][j];
					mat[i][j] = mat[j][i];
					 mat[j][i] = temp;
					
				}
				
			}
		}
	}
	
	
	
	
	static int toFindDiagonalWiseBiggest(int mat[][])
	{
		
		int big = mat[0][0];
		
		for(int i=0; i<mat.length;i++)
		{
			for(int j=0; j<mat[i].length;j++)
			{
				
				if(i == j)
				{
					if(mat[i][j]> big)
					{
						big = mat[i][j];
					}
				}
				
			}
		}
		return big;
	}
	
	
	
	
	static int[][] toPrintInSpiralOrder(int mat[][])
	{
		
		
		int spiral[][] = new int[mat.length][mat[0].length];
		
		int l =0,m =0;
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(i == 0)
				{
					spiral[l][m] = mat[i][j];
					m++;
				}
				
				else if(i == mat.length-1)
				{
					spiral[l][m] = mat[mat.length-1][mat[i].length-1-j];
					m++;
				}
				
				else
				{
					spiral[l][m] = mat[i][j];
					m++;
				}
					
			}
			
			l++;
		}
		
		return spiral;
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of  matrix");

		System.out.println("Enter the row size");
		int m = sc.nextInt();

		System.out.println("Enter the column size");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 1st matrix ");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{

				arr[i][j] = sc.nextInt();
			}
		}

		 //int res[][] = toNinetyDegreeLeft(arr);

		System.out.println();

		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{

				System.out.print(arr[i][j]+ " ");
			}

			System.out.println();
		}


		//int res = toDiagonalWiseBiggest(arr);
		//System.out.println(res);

	}

}
