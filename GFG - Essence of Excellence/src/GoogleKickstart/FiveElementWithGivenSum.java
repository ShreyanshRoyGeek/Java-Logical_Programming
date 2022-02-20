package GoogleKickstart;

import java.util.Arrays;

public class FiveElementWithGivenSum {

	static void toFindThePairOfFiveElementWithGivenSum(int[]arr,int val)
	{

		Arrays.sort(arr);

		for(int i =0; i<arr.length-4;i++)
		{
			for(int j =i+1;j<arr.length-3; j++)
			{
				for(int k =j+1; k<arr.length-2;k++)
				{

					int l = k+1;
					int r = arr.length-1;

					while(l<r)
					{

						if(arr[i]+arr[j]+arr[k]+arr[l]+arr[r] == val)
						{
							System.out.print(arr[i] + " "+ arr[j]+" "+arr[k]+" " + arr[l]+ " "+ arr[r]);
							l++;
							r--;
						}

						else if(arr[i]+arr[j]+arr[k]+arr[l]+arr[r] > val)
							r--;

						else
							l++;

					}

				}

			}
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1,2,3,4,5,6,7,8};
		
		toFindThePairOfFiveElementWithGivenSum(arr,15);




	}

}
