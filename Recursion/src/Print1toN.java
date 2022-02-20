import java.util.Scanner;

public class Print1toN {


	static void display(int x)
	{

		if(x>1)
		{
			display(x-1);
			
		}
		
		System.out.println(x);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");

		int x = sc.nextInt();

		display(x);


	}




}
