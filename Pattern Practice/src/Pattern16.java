/*
 * 
Pattern16 -> 

1 2 3 4 5 
* 1 2 3 4 
* * 1 2 3 
* * * 1 2 
* * * * 1 

*/

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j<i)
					System.out.print("*" + " ");
				
				else
					System.out.print(j-i + 1 + " ");
			}
			
			System.out.println( );
		}

	}

}
