import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				if( (j == n/2+1) && (i>= n/2+1)  || (i == j|| i+j == n+1) 
						&& (i<= n/2+1) )
				
					System.out.print("* ");
				
				else
					System.out.print("  ");
						
			}
			
			System.out.println();
		}

	}

}
