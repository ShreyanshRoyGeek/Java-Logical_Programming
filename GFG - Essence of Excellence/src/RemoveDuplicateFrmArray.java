import java.util.Arrays;
import java.util.*;


public class RemoveDuplicateFrmArray {
	
	static int[] toRemoveDups(int[] arr)
	{
		
		//List l = Arrays.asList(arr);
		
		LinkedHashSet <Integer> l1 = new LinkedHashSet<>();
		
		for(int i =0; i<arr.length;i++)
		{
			l1.add(arr[i]);
		}
		
		int[] arr1 = new int[l1.size()];
		
		int i = 0;
		
		for(Integer element1 : l1)
		{
			
			arr1[i++] = element1;
		
		}
		
		return arr1;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,2,1,2,2,1};
		
		int res[] = toRemoveDups(arr);
		
		for(int i =0; i<res.length;i++)
		{
			System.out.print(res[i] +" ");
		}
		
		

	}

}
