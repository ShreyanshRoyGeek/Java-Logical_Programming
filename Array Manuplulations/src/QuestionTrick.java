import java.util.*;

public class QuestionTrick {

	static int[] toDistribute(int arr[])
	{
		for(int i =0; i<arr.length-1;i++)
		{
			if(arr[i] == arr[i+1])
			{

				return arr;
			}
		}	


		for(int i =0; i<arr.length;i++)
		{

			while(arr[arr.length-1] != arr[0] && i<arr.length)
			{
				Arrays.sort(arr);
				arr[arr.length-1]--;
				arr[0] ++;
				i++;
			}

		}

		return arr;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		int res[] = toDistribute(arr);

		int count =0;

		for(int i =0; i<res.length-1;i++)
		{
			if(res[i] == res[i+1])
			{
				count = 1;
			}

			else
				count = 0;

		}


		if(count == 1)
		{

			for(int j=0;j<res.length;j++)
			{
				System.out.print(res[j] + " ");
			}

		}

		else
			
			System.out.println(-1);
	}


}
