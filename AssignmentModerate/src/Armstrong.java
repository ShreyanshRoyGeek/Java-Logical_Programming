import java.util.Scanner;
public class Armstrong {

	static boolean isArmstrong(int n)
	{
		int temp  = n;
		int  dc = countDigit(n);

		int sum = 0;  

		do {
			int re = n%10;
			sum = sum + pow(re,dc);
			n = n/10;

		}while (n!=0);

		if(sum == temp)
		{
			return true;
		}
		else
			return false;	
	}

	static int countDigit(int n)
	{
		int count = 0;

		while(n!=0)
		{

			count++;
			n= n/10;
		}
		return count;
	}

	static int pow(int re,int count)
	{
		int pow = 1;
		for(int i = 1; i<= count; i++)
		{
			pow = pow * re;
		}

		return pow;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		boolean result = isArmstrong(n);
		
		if(result == true)
			System.out.println("The number is Armstrong ");
		
		else
			System.out.println("The number is not Armstrong ");
		

	}

}
