import java.util.Scanner;

public class MatrixOperationOwn {

	static  int toCountPrime(int[][] mat)
	{

		int primeCount =0;

		for(int i =0; i<mat.length;i++)
		{
			for(int j =0; j<mat[0].length;j++)
			{
				int count =0;

				if(mat[i][j] == 1)
				{
					count++;
				}


				for(int k=2; k<=mat[i][j]/2;k++)
				{


					if(mat[i][j]%k ==0)
					{
						count++;
						break;
					}
				}

				if(count == 0)
				{
					primeCount++;
				}


			}

		}

		return  primeCount;

	}


	static  int[] toRowWiseBiggest(int[][] mat)
	{
		int big[] = new int[mat.length];


		for(int i=0;i<mat.length;i++)
		{
			big[i]= mat[i][0];

			for(int j =0; j<mat[i].length ;j++)
			{
				if(mat[i][j] > big[i])
				{
					big[i] =  mat[i][j];
				}
			}
		}

		return big;

	}


	static  int[] toColumnWiseBiggest(int[][] mat)
	{

		int big[] = new int[mat[0].length];

		for(int i=0; i<mat[0].length;i++)
		{
			big[i] =  mat[0][5];
			
			for(int j=0; j<mat.length;j++)
			{
				if(mat[j][i] > big[i])
				{
					big[i] = mat[j][i];
				}

			}
		}

		return big;

	}


	static  void toRowwiseReverse(int[][] mat)
	{

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length/2;j++)
			{
				int t = mat[i][j];
				mat[i][j] = mat[i][mat[i].length-1-j];
				mat[i][mat.length-1-j] = t;

			}
		}

	}

	static  int[][] toTranspose(int[][] mat)
	{

		int trans[][] = new int[mat[0].length][mat.length];

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				trans[i][j] = mat[j][i];

			}
		}

		return trans;
	}
	
	static void transpose(int arr[][]) //,int n)
    {
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[i].length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        
    }

	static  void toColumnwiseReverse(int[][] mat)
	{

		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				int t = mat[i][j];
				mat[i][j] = mat[mat.length-1-i][j];
				mat[mat.length-1-i][j] = t;

			}
		}

	}
	
	
	static int[][] toRotateNinetyDegreeLeft(int mat[][])
	{
		mat = toTranspose(mat);
		
		toColumnwiseReverse(mat);
		
		
		return mat;
		
		
	}
	
	
	static int[][] toRotateNinetyDegreeRight(int mat[][])
	{
		mat = toTranspose(mat);
		
		toRowwiseReverse(mat);
		
		
		return mat;
		
		
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

		toColumnwiseReverse(arr);

		System.out.println();

		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{

				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}

		
		//int res = toCountPrime(arr);
		//System.out.println(res);

	}

}
