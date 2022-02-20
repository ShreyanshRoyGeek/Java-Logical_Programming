import java.util.Scanner;

public class NeonNumber {
	
	static boolean isNeonNumber(int n)
	{
		int temp = n*n; int sum = 0;
		
		
		do
		{
			int re = temp%10;
			
			sum = sum+re;
			
			temp = temp/10;	
		   
		}while(temp!=0);
		
		if(sum == n)
		{
			return true;
		}
		
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		System.out.println(isNeonNumber(n));

	}

}
