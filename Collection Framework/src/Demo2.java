import java.util.Scanner;

public class Demo2 {

	public static  void convertWaveArray(int arr[], int n)
	{
		for(int i =0 ;i<n-1; i+=2)
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int  t = sc.nextInt();



		while(t-->0)
		{


			int n = sc.nextInt();

			int arr[] = new int[n];

			for(int i=0;i<n;i++)
			{

				arr[i] = sc.nextInt();

			}


			//Demo2 d = new Demo2();

			Demo2.convertWaveArray(arr,n);
			
			//StringBuffer sb = new StringBuffer();
			
			for(int i=0;i<n; i++)
			{
				//sb.append(arr[i] + " ");
				
				System.out.print(arr[i] + " ");
				
			}
			
			//System.out.println(sb+ " ");


		}
	}

}
