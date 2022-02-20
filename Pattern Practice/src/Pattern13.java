/*
 * 
Pattern13 -> 

a b c d e 
a b c d e 
a b c d e 
a b c d e 
a b c d e 


*/


public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=5; i++)
		{
			int count =1;
			
			for(int j =1; j<=5; j++)
			{
				
				
				System.out.print((char) (count + 96) + " ");
				
				count++;
			}
			
			System.out.println();
				
		}
		
		

	}

}
