import java.util.Scanner;

public class CaluculateXtothePowerofN {

	static int pow(int n, int p)
	{
		if(p == 0)
		{
			return 1;
		}

		return n*pow(n,p-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int x = sc.nextInt(); 
		int n = sc.nextInt(); 

		int res = pow(x,n);

		System.out.println(res);




	}

}
