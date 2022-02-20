import java.util.Scanner;

public class HackerRank {

	static int[] frequency(int arr[],int n)
	{
		
		int arr2[] = new int[n];
		
		

		for(int i =0; i<arr.length;i++)
		{
			int count =1;

			if(arr[i]!=-1)
			{
				for(int j =i+1; j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						count++;

						arr[j] =-1;
					}
				}
			
			}
			
			arr2[i] = count;
		

		}
		
		return arr2;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		int arr[] = new int[n];
		
		int arr4[] = new int[n];
		
		int res =0;
		
		for(int i=0; i<arr.length;i++)
		{
			int[] arr3= frequency(arr,n);
			
			res = res +arr3[i]/2; 
		}
	
		
		System.out.println(res);

	}

}
