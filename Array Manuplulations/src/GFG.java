
public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int re[] = new int[20];
		
		int arr[] = new int[] {100,210, 310};
		
		
		int j =0;
     	for(int i = 0; i<arr.length; i++)
		{
     		
     		while(arr[i]!=0)
     		{
     			re[j] = arr[i]%10;
     			j++;
 
     			arr[i] = arr[i]/10;
     		}
			
		}
     	
     	for(int i = 0; i<re.length; i++)
     	{
     		System.out.print(re[i] + " ");
     	}
     	
	}

}
