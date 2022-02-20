
public class Pattern {
	
	static void starf()
	{
		for(int i = 0 ; i< 5; i++)
		{
			for(int j=0;j<=i; j++)
			{
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
	}
	
	static void starr()
	{
		for(int i=0; i<=5;i++)
		{
			for(int j = 5; j>i; j--)
			{
				System.out.print(" - ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
	
		starf();
		
		System.out.println();
		
		starr();
		
		
		
		

	}

}
