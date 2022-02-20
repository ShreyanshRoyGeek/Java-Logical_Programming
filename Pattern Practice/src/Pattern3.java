/*

Pattern3 -> 

5 4 3 2 1 
5 5 3 2 1 
5 5 5 2 1 
5 5 5 5 1 

*/

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>=1; j--)
			{
				if(i+j > 5) {
					System.out.print(5 + " ");
				}
				
				else {
					System.out.print(j + " ");
				}
			}
			
			System.out.println();
		}

	}

}
