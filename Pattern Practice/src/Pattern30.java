/*
  
Pattern30 -> 

       1 
      1 0 1 
    1 0 1 0 1 
  1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 1 

*/


public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k =1;
		
		for(int i=1; i<=5; i++)
		{
			
			for(int j =1; j<=5-i; j++)
			{
				System.out.print("  ");
			}
			
			
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print(k%2+ " ");
				k++;
				
			}
			
			System.out.println();
		}

	}

}
