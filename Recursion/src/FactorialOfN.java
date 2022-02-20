import java.util.Scanner;

public class FactorialOfN {


	static int fact(int x)
	{

		if(x == 0 || x == 1)
		{
			return 1;
		}

		return x*fact(x-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int x = sc.nextInt();
		
		int res = fact(x);
		
		System.out.println(res);

	}

}
