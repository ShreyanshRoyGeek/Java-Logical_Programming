import java.util.Scanner;
public class StrongNumber {

	static boolean isStrong(int n)
	{
		int sum = 0;

		int temp = n;

		do 
		{
			int r = n%10;

			sum = sum + fact(r) ;

			n = n/10;

		}while(n!=0);

		return (sum == temp);


	}

	static int fact(int r)
	{
		int res = 1;
		if( r == 0 || r==1 )
		{
			return 1;
		}

		for(int i = 2; i<r; i++)
		{
			res = res *i;
		}
		return res;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean res = isStrong(n);	


	}

}
