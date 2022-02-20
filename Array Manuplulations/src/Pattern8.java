import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sp = 0, st =n;
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print("  ");
			}
			
			int k = sp+1;
			
			for(int j = 1; j<=st; j++)
			{
				System.out.print(k + " ");
				
				
				
				if(j<=st/2)
				
					k++;
				
				else
					k--;
			}
			
			if(i<=n/2)
			{
				sp++;
				st = st-2;
			}
			else
			{
				sp--; 
				st = st+2;
			}
			
			System.out.println();	
		}
		
		

	}

}
