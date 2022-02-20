import java.util.Scanner;

public class NumberIsPalindromeOrNot {
	
	
	static boolean isPlaindrome(int x)
	{
		
		return check_palindrome(x,0,x);
				
	}
	
	static boolean check_palindrome(int num, int rev, int n)
	{
		if(n== 0)
		{
			return num == rev;
		}
		
		return check_palindrome(num,rev*10+n%10, n/10);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int x = sc.nextInt(); 
		

		boolean res = isPlaindrome(x);
		
		if(res == true)
		{
			System.out.println("palindrome");
		}
		
		else
			System.out.println("not a palindrome");
 

	}

}
