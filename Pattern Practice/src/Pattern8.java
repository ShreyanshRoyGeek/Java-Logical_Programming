/*
 * 
Pattern8 ->
 
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 

*/



public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<= 5; i++) {
			for(int j=1; j<=5; j++) {
				
				System.out.print((char)( i + 64) + " ");
			}
			
			System.out.println();
		}

	}

}
