import java.util.Scanner;

public class ArrayofStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many words you have  ");
		int n = sc.nextInt();
		
		String s[] = new String[n];
		
		for(int i=0; i<n; i++)
		{
			s[i] = sc.next();
		}
		
		System.out.println("The reverse sequence ");
		
		for(int i = s.length-1; i>=0 ; i--)
		{
			System.out.print(s[i] + " ");
		}
		
		
		System.out.println();
		
	}

}
