import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sp = n/2, st =1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print("  ");
			}
			
			int k= 1;
			
			for(int j = 1; j<=st; j++)
			{
				
				
				System.out.print((char)(64 + k) + " ");
				
				if(j<=st/2)
				
					k++;
				
				else
					k--;
			}
			
			if(i<=n/2)
			{
				sp--;
				st = st+2;
			}
			else
			{
				sp++; 
				st = st-2;
			}
			
			System.out.println();	
		}
		
		

	}

}
