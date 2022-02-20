
public class UniqueElemntInAnArray {
	
	static void toFindtheNonRepeatingSequence(int arr[])
	{
		
		
		for(int i =0; i<arr.length;i++)
		{
			int count = 0;
			
			for(int j = 0; j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
					count++;
			}
			
			if(count == 0)
				System.out.print(arr[i]+ " ");
			
		}
		
		
	}
	
	static int toFindtheFirstNonRepeatingSequence(int arr[])
	{
		
		for(int i =0; i<arr.length;i++)
		{
			int j=0;
			
			for(j = 0; j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j) //Repeated Element
					break;
			}
			
			if(j == arr.length)
				return arr[i];
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4,1,3,4,5};
		
		toFindtheNonRepeatingSequence(arr);
		
		System.out.println();
	
		System.out.println(toFindtheFirstNonRepeatingSequence(arr));

	}

}
