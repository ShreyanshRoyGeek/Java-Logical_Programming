import java.util.Scanner;

public class Demo {
	
	static int pairSum(int[] arr,int N, int val)
	{
		int i = 0; //first pointer
		int j = N-1; //second pointer
		
		while(i<j)
		{
			
			if(arr[i]+arr[j] == val)
				return 1;
			
			
			else if(arr[i]+arr[j]>val)
				j--;
			
			
			else
				i--;
				
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		
		int arrSize = arr.length;
		
		System.out.println(pairSum(arr,arrSize,5));
		
	}

	

}
