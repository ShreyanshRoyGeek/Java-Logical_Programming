import java.util.Scanner;

public class Array {

	static void flushI(int arr[])
	{
	
		/* without using additional array */
		
		int j =0;

		for(int i =0; i<arr.length; i++)
		{

			if(arr[i]!=0)
			{
				arr[j] = arr[i];
				j++;
			}

		}

		for(int i=j;i<arr.length;i++)
		{
			arr[j] = 0;
			j++;
		}



	}
	
	
	static int[] flushII(int arr[])
	{ 
		
		int temp[]  = new int[arr.length];
		
		int j =0;
		for(int i =0; i<arr.length;i++)
		{
			
			if(arr[i]!=0)
			{
				temp[j] = arr[i];	
				j++;
			}
				
		}
		
		
		
		return temp;
	}
	
	
	static void toSegregate0And1(int arr[])
	{
		
		int count =0;
		
		for(int i =0; i<arr.length;i++)
		{
			
			if(arr[i]!= 0)
			{
				count++;
			}
		}
		
		for(int i =0; i<arr.length;i++)
		{
			
			if(i<count)
			
				arr[i] = 1;
			
			
			else
				arr[i] =0;
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] =sc.nextInt();
		}



		//flushI(arr);
		//flushII(arr);
		//toSegregate0And1(arr);
		
		int[] res = flushII(arr);
		
		for(int i = 0; i<arr.length ;i++)
		{

			System.out.print(res[i]+ " ");

		}
		

	}

}
