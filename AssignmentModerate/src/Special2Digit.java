import java.util.Scanner;

public class Special2Digit {
	
	static boolean specialDigit(int x)
	{
		int re = x%10;
		int div = x/10;
		
		int res = re + div + re * div;
		
		if(res == x)
		{
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean res = specialDigit(n);
		
		if(res == true)
		{
			System.out.println("Special2 digit");
		}
		
		else
		{
			System.out.println("Not a special2 digit");
		}
		
	}

}
