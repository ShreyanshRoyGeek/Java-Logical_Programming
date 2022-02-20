/*
  
Pattern32 -> 

        a 
      a b c 
    a b c d e 
  a b c d e f g 
a b c d e f g h i 


*/

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1; j<= 2*i-1; j++)
			{
				System.out.print((char)(96+j) + " ");
			}
			
			System.out.println();
		}
	}

}
