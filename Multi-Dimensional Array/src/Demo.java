import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of 2 dimensional array");
		
		System.out.println("Enter the row size");
		int n = sc.nextInt();
		
		System.out.println("Enter the column size");
		int m = sc.nextInt();
		
		int[][] arr = new int[m][n];
		int[][] ar = new int[][] {{2,4,6}, {5,2,4}};
		
		
		System.out.println("Enter the array elements ");
		
		for(int i =0; i<n; i++)
		{
			for(int j =0 ; j<m ; j++)
			{
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		System.out.println("The resulting 2-d array becomes ");
		
		for(int i =0; i<n; i++)
		{
			for(int j =0 ; j<m ; j++)
			{
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(arr);
		

		
		
		
	}

}
