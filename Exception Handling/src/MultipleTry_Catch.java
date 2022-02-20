import java.util.Scanner;

public class MultipleTry_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {40,30,20,10,0};
		
		
		try 
		{
			int div = arr[1]/ arr[3];
			
			System.out.println(div);
			
			try
			{
				System.out.println(arr[5]);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Index is invalid");
			}
			
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Number can't be divided by 0");
		}
		
		
		
		
		System.out.println("Super!  Keep coding like a geek!, Bye. ");
		
		
		

	}

}
