//package GoogleKickstart;

public class CountPairsWithGivenSum {
	
	static int toFindPairsValue(int[]arr,int sum)
	{
			
		int count = 0;
			int l =0;
			int r = arr.length-1;
			
			while(l<r)
			{
				if(arr[l]+arr[r] == sum)
				{
					count++;
					l++;
					r--;
				}
				
				else if(arr[l]+arr[r] > sum)
					r--;
				
				else
					l++;
				
			}
			
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4,5};
		
		int res = toFindPairsValue(arr,5);
		
		System.out.println(res);
		
		

	}

}
