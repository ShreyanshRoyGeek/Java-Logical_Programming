import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int counte = 0; int counto = 0;
		
		do
		{
		
			int re = n%10;
			
			if(re%2 == 0)
				
				counte++;
			
			else
			
				counto++;
		
			n = n/10;
			
		}while(n!=0);
		
		System.out.println("the no of even no is " + counte);
		
		System.out.println("the no of odd no is " + counto);
		
	}

}
