/*
  
Pattern28 ->  (VVI)

        1 
      1 * 2 
    1 * 2 * 3 
  1 * 2 * 3 * 4 
1 * 2 * 3 * 4 * 5 

*/

public class Patter28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=5; i++)
		{
			for(int j =1; j<= 5-i; j++)
			{
				System.out.print("  ");
				
			}
			
			for(int j =1; j<= i; j++)
			{
				
				System.out.print(j+ " ");
				
				if(j<i)
					System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}

