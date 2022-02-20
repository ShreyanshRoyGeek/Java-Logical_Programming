/*
Pattern4 -> 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/


public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=5; i++) {
			int count = 5;
			
			for(int j =1; j<= 5; j++) {
				
				System.out.print(count + " ");
				count--;
				
			}
			System.out.println();
			
		}

	}

}
