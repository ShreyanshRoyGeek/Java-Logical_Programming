import java.util.Scanner;
public class Diserium {


	static int isDiserium(int n)
	{	
		int sum = 0; int count = countDigit(n);
		
		
		while(n!=0)
		{
			int re = n%10;
			sum = sum+ pow(re,count);
			count--;
			n= n/10;
		}
	
		return sum;
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
	
	
	
	static int countDigit(int n)
	{
		int count = 0 ;
		
		while(n!=0)
		{
			
			count++;
			n= n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int res = isDiserium(n);
		
		if(res == n)
		{
			System.out.println("The number is Diserium ");
		}
		
		else
		{
			System.out.println("number is not Diserium ");
		}
		
		System.out.println("Sum is " + res);
	
	}

}
