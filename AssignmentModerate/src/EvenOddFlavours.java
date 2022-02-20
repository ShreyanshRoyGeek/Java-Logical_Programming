import java.util.Scanner;
public class EvenOddFlavours {
	
	
	static void evenOddWithoutIfElse(int x)
	{
		String[] s = {"Even","Odd"};
		
		System.out.println(s[x%2]);
	}
	
	static void evenOddWithoutMod(int x)
	{
		if(x/2*2 == x)
			
			System.out.println("Even");
		
		else
			System.out.println("Odd");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		evenOddWithoutIfElse(n);
		
		
	}

}
