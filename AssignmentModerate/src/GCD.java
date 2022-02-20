import java.util.Scanner;
public class GCD {

	static int isGCD(int m,int n)
	{
		int i =1;
		int gcd = 1;
	

		for( i=1; i<=m&&i<=n; i++)
		{
			if(m%i == 0 && n%i == 0)
			{
				gcd = i;
			}
		}
	
		return gcd;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		int res = isGCD(m,n);	
		
		System.out.println(res);
		
		int lcm = m*n/res;
		
		System.out.println(lcm);
		
	}

}
