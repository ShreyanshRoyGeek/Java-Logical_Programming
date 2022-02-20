
public class Live {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Start");

		try {
			int i = Integer.parseInt("20");
			System.out.println(i);
			
			
		
		}
		
//		catch(Exception e){
//			System.out.println("Check the string type");
//			String str = e.getMessage();
//			System.out.println(str);
//			
//		}
		
		//System.out.println("end");
		
		finally
		{
			System.out.println("Main End");
				
			
			try {
				int i = Integer.parseInt("20");
				System.out.println(i);
				
				int j = Integer.parseInt("Hello");
				System.out.println(j);
			
			}
			
			catch(Exception e){
				System.out.println("Check the string type");
				String str = e.getMessage();
				System.out.println(str);
				
			}
		}
		
		
	}

}
