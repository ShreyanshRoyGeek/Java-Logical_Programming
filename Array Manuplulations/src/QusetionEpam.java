import java.util.Scanner;
public class QusetionEpam {

	static int count(int arr[])
	{
		int count =0;

		for(int i=0;i<arr.length; i++)
		{

			if(arr[i]== 1)
			{
				count++;
			}

		}

		for(int i= 0; i<arr.length-2;i++)
		{

			if(arr[i]== arr[i+2])
			{
				if(arr[i] + arr[i+1] + arr[i+2]==2)
				{
					count++;
				}
			}
			

		}

		return count;


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of inputs ");
		int t = sc.nextInt();
		
		
		while(t-->0)
		{


		System.out.println("Enter the size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}


		int res = count(arr);
		
		System.out.println(res);
		

		}

	}

}
