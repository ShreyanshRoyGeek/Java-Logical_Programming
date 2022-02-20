import java.util.Scanner;
public class PrimeDigitCount {

	static int primec()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int n = sc.nextInt();

		int i = 0;
		int count = 0;

		int res = 0;

		while(n>0)
		{

			int re = n%10;


			if (re == 2 || re == 3|| re == 5 || re == 7)

				count++;

			n = n/10;
		}


		return count;

	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int result = primec();

		System.out.println(result);


	}

}