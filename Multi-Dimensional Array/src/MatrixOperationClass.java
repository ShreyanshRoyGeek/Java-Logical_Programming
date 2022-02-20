import java.util.Scanner;

public class MatrixOperationClass {
	
	
	static String toFindMaxAndMin(int[][] arr)
	{
		
		int max =  arr[0][0];
		int min =  arr[0][0];
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0 ; j<arr[i].length; j++)
			{
				if(arr[i][j]> max)
					max = arr[i][j];
				
				else if(arr[i][j]> min)
					min = arr[i][j];
				
				
			}
		}
		
		String result = max + " " + min; 
		return  result;
		
		
	}
	
	static int[] rowWiseBggest(int[][] mat)
	{
		
		int big[] = new int[mat.length];
		
		for(int i =0; i<mat.length;i++)
		{
			big[i] = mat[i][0];
			
			for(int j=i; j<mat[i].length;j++)
			{
				if(mat[i][j]>big[i])
				{
					big[i] = mat[i][j];
				}
			}
		}
		
		return big;
	}
	
	
	
		
	static int[] columnWiseBggest(int[][] mat)
	{
		int big[] = new int[mat[0].length];
		
		for(int i =0; i<mat[0].length;i++)
		{
			big[i] = mat[0][i];
			
			for(int j =1; j<mat.length;j++)
			{
				if(mat[j][i]>big[i])
				{
					big[i] = mat[j][i];
				}
				
			}
		}
		
		return big;
		
	}
	
	static void rowWiseReverse(int[][] mat)
	{
		for(int i =0; i<mat.length;i++)
		{
			for(int j =0; j<mat[i].length/2;j++)
			{
				
				int t = mat[i][j];
				mat[i][j] = mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j] = t;
			}
		}
	
	}
	
	static void columnWiseReverse(int[][] mat)
	{
		for(int i =0; i<mat.length/2;i++)
		{
			for(int j =0; j<mat[j].length;j++)
			{
				
				int t = mat[i][j];
				mat[i][j] = mat[mat.length-1-i][j];
				mat[mat.length-1-i][j] = t; 
			}
		}
	
	}
	
	static void transpose(int[][] mat)
	{
		
		int trans[][] = new int[mat[0].length][mat.length];
		
		for(int i =0; i<trans.length;i++)
		{
			for(int j =0; j<trans[j].length;j++)
			{
				trans[j][i] = mat[i][j];
				
			}
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

		int[][] arr = new int[m][n];
		
		
		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 1st matrix ");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		String res = toFindMaxAndMin(arr);
		
		System.out.println("Biggest and Smallest elements in the matrix are "+ res);
				
		
	}

}
