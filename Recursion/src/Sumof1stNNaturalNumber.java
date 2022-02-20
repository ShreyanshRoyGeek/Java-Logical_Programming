import java.util.Scanner;

public class Sumof1stNNaturalNumber {

	static int sum(int x)
	{
		if(x ==0)
		{
			return 0;
		}

		return x + sum(x-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");

		int x = sc.nextInt();

		int res = sum(x);

		System.out.println(res);


	}

}
