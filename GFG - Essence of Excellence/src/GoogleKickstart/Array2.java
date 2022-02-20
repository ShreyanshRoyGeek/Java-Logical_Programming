package GoogleKickstart;

/* Check out  from following dates which one is the record breaking date */

public class Array2 {
	
	static int toCheckCondition(int[] arr)
	{
		
		int i = 0;
		int j = arr.length;
		
		while(i<arr.length && j>=0)
		{
			if(arr[i]>arr[j])
			{
				j--;
			}
			
			if(arr[i]<arr[j]) 
			{
				i++;
			}
		}
		
		return arr[i];
	}
	
	static int toReturnBig(int[] arr)
	{
		int big = arr[0];
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]>big)
				big = arr[i];
			
		}
		
		return big;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,0,7,2,0,2,2};
		
		//int res = toCheckCondition(arr);
		
		int res = toReturnBig(arr);
		
		System.out.println(res);

	}

}
