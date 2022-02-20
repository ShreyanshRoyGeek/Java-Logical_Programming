import java.util.Scanner;

public class Biggest2 {
	
	static int biggest(int arr[])
	{
		int big =0;
		 
		big  = arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if(big<arr[i])
			{
				big = arr[i];
			}
		}
		
		System.out.println(big);
		
		int sb = arr[0];
		
		for(int i =1; i<arr.length; i++)
		{
			if(arr[i] == big)
			{
				continue;
			}
			
			else
			{	
				if(sb<arr[i])
				{
					sb = arr[i];
				}
			}
		
			
		}
		
		System.out.println(sb);
		
		int sum = big + sb;
			
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc  = new Scanner(System.in);

		
		int n= sc.nextInt();
		
		 int arr[] = new int[n];
		 
		 
		 System.out.println("Enter the elements");

			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}


			int res = biggest(arr);
			
			System.out.println(res);
		 
		
		

	}

}
