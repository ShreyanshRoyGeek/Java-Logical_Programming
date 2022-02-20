/*
 * 
Pattern11 -> 

A A A A A 
A A A A A 
A A A A A 
A A A A A 
A A A A A 


*/






public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<= 5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				int count =1;
				
				System.out.print((char)( count + 64) + " ");
				
				count++;
			}
			
			System.out.println();
		}

	}

}
