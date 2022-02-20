import java.util.Scanner;

public class VendingMachine{
	
	Object pressButton()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for Coffee or Enter 0 for Tea");
		
		int n = sc.nextInt();
		
		sc.close();
		
		if(n == 1)
		{
			return new Coffee();
		}
		
		else if(n == 0)
		{
			return new Tea();
		}
		
		else
		{
			System.out.println("Invalid Output");
			return null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VendingMachine m = new VendingMachine();
		
		Object res = m.pressButton();
		
		System.out.println(res);
		
	}

}
