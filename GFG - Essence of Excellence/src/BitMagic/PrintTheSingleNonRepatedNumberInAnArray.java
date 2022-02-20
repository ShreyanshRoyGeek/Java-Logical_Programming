package BitMagic;

/* To print the single non-repeated digit in a nonzero array   */

public class PrintTheSingleNonRepatedNumberInAnArray {
	
	static int toReturnNonRepatedNumber(int[] arr)
	{
		
		int xor = 0;
		for(int i =0; i<arr.length;i++)
		{
			xor = xor ^ arr[i]; 
			// 1^2^3^2^3 = 1 (2 and 3 got cancelled -- xor of same number is 0)
		}
		
		return xor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,2,3,4,5,4,5,1,-2};
		
		int res = toReturnNonRepatedNumber(arr);
		                        
		System.out.println(res);
		
		//int x = 5 ^ 0;
		//System.out.println(x); // 5
		
	}

}
