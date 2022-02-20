import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		String str = sc.next();
		
		String string = "";
		
		
		// using simple for-loop and continue;
		// using substring method;
		
		
		System.out.println("Enter the number of character to remove ");
		int n = sc.nextInt();
		
		for(int i=0; i<str.length();i++)
		{
			string =  str.substring(0, n) + str.substring(n+1);
		}
		
		
		System.out.println(string);
	}

}
