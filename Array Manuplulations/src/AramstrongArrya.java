import java.util.*;

public class AramstrongArrya {
	
	
	static int numberofArmastrong(int arr[], int n)
	{
		int count= 0;
		
		for(int i =0; i<n; i++)
		{
			boolean result = isArmstrong(arr[i]);
			
			if(result== true)
			{
				count++;
			}
		}
		
		return count;
	}
	
	static boolean  isArmstrong(int x)
	{
		double sum = 0; double temp = x;
		while(x!=0)
		{
			int re = x%10;
			
			sum = sum + power(re,3); //Math.pow(re,3)
							
			x = x/10;
		}
		
		if(sum == temp)
		{
			return true;
		}
		
		else
			return false;
		
		
	}
	
	static int power(int x, int y)
	{
		int pro=1;
		
		for(int i = 1; i<=y ; i++)
		{
			pro = pro*x;
			
		}
		return pro;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter 3 digit " + n + " number");
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		int res = numberofArmastrong(arr, n);
		
		System.out.println("The number of armstrong number in the array  is " + res);


	}

}
