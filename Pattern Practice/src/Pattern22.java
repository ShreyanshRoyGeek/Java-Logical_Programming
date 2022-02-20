/*
  
Pattern22 -> 

1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 


*/

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
