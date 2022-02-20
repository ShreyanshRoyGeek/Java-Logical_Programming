/*
  
Pattern21 -> 

1 0 1 0 1 
1 0 1 0 
1 0 1 
1 0 
1 


*/

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j%2 + " ");
			}
			
			System.out.println();
		}

	}

}
