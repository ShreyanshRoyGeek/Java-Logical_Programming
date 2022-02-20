import java.util.Scanner;

public class HappyNumber {
	
	static boolean isHappyNumber(int n)
	{
		while(n>9)
		{
			int sum =0;
			
			do 
			{
				int r = n%10;
				 sum = sum + r*r;
				 n = n/10;
			}while(n!=0);
			
			n = sum;
		}
		
		return (n == 1|| n == 7);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		System.out.println(isHappyNumber(n));
	}
}
