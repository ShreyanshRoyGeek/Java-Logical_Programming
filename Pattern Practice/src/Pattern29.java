/*
  
Pattern29 -> 

       1 
      1 0 1 
    1 0 1 0 1 
  1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 1 

*/

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<= 5; i++)
		{
			for(int j =1; j<= 5-i; j++)
			{
				System.out.print("  ");
			}
			
			for(int j = 1; j<= 2*i-1; j++)
			{
				System.out.print(j%2 + " "); 
			}
			
			System.out.println();
		}

	}

}
