import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		try
		{
			int div = a/b;
			
			System.out.println("The dision result is " + div);
	
		}
		
		catch(ArithmeticException e)
		{

			if(b == 0)
				
				System.out.println("Number can't be divided by 0");
		}
		
		System.out.println("Congrats!  Keep coding like a geek!, Bye. ");

	}

}
