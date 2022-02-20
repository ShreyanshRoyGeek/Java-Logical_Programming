//package GoogleKickstart;

import java.util.*;

public class TripletWithDesiredSum {

	static String[] toFindConsecutiveTriplet(int arr[]) // O(n)
	{
		String res[] = new String[3];

		int m =0;
		boolean found;

		for(int i =0,j =i+1,k = j+1; i<arr.length-2 && j<arr.length-1 && k<arr.length; i++,j++,k++)
		{
			if(arr[i]+ arr[j]+ arr[k] == 0)
			{
				res[m++] =  arr[i] + " " + arr[j] + " " + arr[k];
				found = true;

			}	

		}

		if(found = true)
			return res;
		else
			return null;
	}


	static String[] toFindAllPossibleTriplet(int arr[])  // <--O(n^2){Only 2 nested loop is required 
	//(doubt --> why we don't count the complexity of sorting(nlogn)}. 
	// which is better than O(n^3) {BruteForce Search or Naive Approach(3 nested loop for i,j and k)}.
	{
		String res[] = new String[arr.length];

		Arrays.sort(arr); //O(nlogn) --> QuickSort

		int m =0;
		boolean found = false; 

		for(int i =0; i<arr.length-1;i++)
		{

			//int x = arr[i];
			int r = arr.length-1;
			int l = i+1;

			while(l<r)
			{
				if(arr[i]+arr[l]+ arr[r] == 0)
				{
					res[m++] =  arr[i] + " " + arr[l] + " " + arr[r];
					found = true;
					l++;
					r--;
				}

				else if(arr[i]+arr[l]+ arr[r] > 0)
					r--;


				else
					l++;

			}

		}


		if(found = true)
			return res;
		else
			return null;

	}



	static void toFindTripletWithSumToAGivenValue(int[] arr, int val)
	{
		Arrays.sort(arr);

		for(int i =0; i<arr.length;i++)
		{
			int l = i+1;
			int r = arr.length-1;

			while(l<r)
			{
				if(arr[i]+arr[l]+arr[r] == val)
				{
					System.out.println(arr[i]+ " "+ arr[l] +" "+   arr[r]);
					r--;
					l++;
				}

				else if(arr[i]+arr[l]+arr[r] >= val)
					r--;


				else
					l++;
			}


		}

	}

	static void toFindATripletWhoseSumOfFirst2ValuesIsOfThirdOne(int[] arr)
	{

		Arrays.sort(arr);

		for(int i =arr.length-1; i>= 0;i--)
		{
			int l = 0;
			int r = i-1;

			while(l<r)
			{
				if(arr[l]+arr[r] == arr[i])
				{
					System.out.println(arr[i]+ " "+ arr[l] +" "+   arr[r]);
					r--;
					l++;
					//return;
				}

				else if(arr[l]+arr[r] > arr[i])
					r--;


				else
					l++;
			}


		}


	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1,0,-1,5,4,-3,-5};

		//String res[] = toFindConsecutiveTriplet(arr);

		String res[] = toFindAllPossibleTriplet(arr);

		//toFindTripletWithSumToAGivenValue(arr,5);
		
		//toFindATripletWhoseSumOfFirst2ValuesIsOfThirdOne(arr);



		for(int i =0; i<res.length;i++)
		{
			if(res[i]!= null)
				System.out.println(res[i]);

		}

	}

}
