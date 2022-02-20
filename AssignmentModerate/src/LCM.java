import java.util.Scanner;

public class LCM {
	
	static int isLCM(int x, int y)
	{
		
		int a  = x ; int b  = y;
		
		while(x != y)
		{
			if(x<y)
			{
				x = x+x;
				//i++;
			}
			else
			{
				y = y+y;
				//j++;
			}	
			 
		}
		
		return x;
	}
	
	
	
	
	static int lcm(int m, int n)
	{
		int x = m; int y = n;
		
		
		while(x!=y)
		{
			if(x<=y)
			{
				//x = x + m*i;
				x = x+m;   
			}
			else 
				//y = y +  n*i;
				y = y+n;  
				
		}
		
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		int res = lcm(m,n);	
		
		System.out.println(res);
		
		 

	}

}
