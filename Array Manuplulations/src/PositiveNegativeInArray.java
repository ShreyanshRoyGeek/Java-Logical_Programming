import java.util.Scanner;

public class PositiveNegativeInArray {
	
	static int[] toCountPositiveNegative(int arr[])
	{
		int pc=0, nc =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
				nc++;
			else
				pc++;
			
		}
		
		int count[] = new int[] {pc,nc};
		
		return count;
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " elements ");
		for(int i =0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		
		int res[] = toCountPositiveNegative(arr);
		
		for(int i = 0; i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}

	

	}

}
