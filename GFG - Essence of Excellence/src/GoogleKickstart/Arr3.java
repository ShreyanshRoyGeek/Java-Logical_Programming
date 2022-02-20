package GoogleKickstart;

/* First repeating element in an array of integers */

public class Arr3 {
	
	
	static int consecutiveRepeatedvalueIndex(int[] arr)  // O(n)
	{
		
		for(int i = 0,j=i+1;i<arr.length&&j<arr.length-1;i++,j++)
		{
			if(arr[j] == arr[i])
				return i+1;
		}
		
		return 0;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,5,4,5,5,7};
		
		int res = consecutiveRepeatedvalueIndex(arr);
		
		System.out.println(res);
		
		
		
		

	}

}
