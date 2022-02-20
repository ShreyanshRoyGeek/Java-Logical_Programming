/*
 * 
Pattern10 -> 

1 2 3 4 5 
6 7 8 9 1 
2 3 4 5 6 
7 8 9 1 2 
3 4 5 6 7 


*/




public class Patter10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int count =1;
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if(count> 9)
				{
					count =  1;
				}
				
				System.out.print(count + " ");
				count ++;
				
			}
			
			System.out.println();
		}

	}

}
