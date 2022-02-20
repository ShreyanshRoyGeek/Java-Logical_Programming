import java.util.Scanner;

public class FrequencyOfArray {

	static void toClaculateFrequency(int arr1[])
	{
		
		for(int i =0; i<arr1.length;i++)
		{
			if(arr1[i]!=-1)
			{
				int count = 1;
				
				for(int j =i+1;j<arr1.length;j++)
				{

					if(arr1[i]== arr1[j])
					{
						count++;
						arr1[j] = -1;
					}

				}

				System.out.println(arr1[i] + " -- " + count);

			}



		}


	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr1[] = new int[n];

		System.out.println("Enter " + n + " elements array ");

		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}

		 toClaculateFrequency(arr1);

//		for(int i =0; i<res.length;i++)
//		{
//			System.out.print(res[i] + " ");
//		}


	}

}
