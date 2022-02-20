/*
  
Pattern23 -> 

A 
A B 
A B C 
A B C D 
A B C D E 



*/


public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=5; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print((char)(j+64) + " ");
			}
			
			System.out.println();
		}

	}

}
