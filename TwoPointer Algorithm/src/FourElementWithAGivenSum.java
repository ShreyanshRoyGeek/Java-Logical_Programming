//package GoogleKickstart;

import java.util.Arrays;

public class FourElementWithAGivenSum {
	
	static void toFindThePairOfFourElementWithGivenSum(int[] arr,int val)
	{
		
		Arrays.sort(arr);
		
		//int l,r;
		
		for(int i =0; i<arr.length-3;i++)
		{
			for(int j =i+1; j<arr.length-2;j++)
			{
				
				int l = j+1;
				int r = arr.length-1;
				
				while(l<r)
				{
					if(arr[i]+arr[j]+arr[l]+arr[r] == val)
					{
						System.out.print(arr[i] + " " + arr[j] + " " + arr[l]+ " "+ arr[r]);
						l++;
						r--;
					}
					
					else if(arr[i]+arr[j]+arr[l]+arr[r] > val)
						r--;
					
					else
						l++;
					
				}
				
				
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4,5};
		
		
		toFindThePairOfFourElementWithGivenSum(arr,12);
		
		
	

	}

}
