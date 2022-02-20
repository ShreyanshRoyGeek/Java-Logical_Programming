/*
  
Pattern25 -> 

1 
1 * 
1 * 2 
1 * 2 * 
1 * 2 * 3 


*/



public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int  i=1; i<=5; i++)
		{
			int k =1;
			
			for(int j=1; j<=i; j++)
			{
				if(j%2 == 0)
				{
					System.out.print("*" + " ");
				}
				
				else
					System.out.print(k++ + " ");
			}
			
			System.out.println();
		}

	}

}
