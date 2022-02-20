import java.util.Scanner;

public class Main 
{

	static String getString(int x)
	{
		String res = (x%3 == 0 && x%5 ==0 ? "fizzbuzz" : x%3==0 ? "fizz" : x%5==0 ? "buzz" : "no");

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = getString(n);

		System.out.println(s);

	}

}
