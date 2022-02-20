import java.util.Scanner;

public class Result {
	
	
	static String getResult(int x1, int x2, int x3, int x4)
	{
		
		double avg = x1+x2+x3+x4/4;
		
		if(x1<35 || x2<35 || x3<35 || x4<35 )
				
			return "fail";
		
		String res = (avg>=85 ? "Distinction" : avg>= 60 ? "1st" : avg>= 50 ? "2nd" : "pass");
		
		
//		if(avg>= 85)
//		{
//			return "Destinction";
//		}
//		
//		if(avg>= 60)
//			return "1st";
//		
//		if(avg>= 50)
//			return "2nd";
//			
//		
//		return "pass";	
			
		return res;	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int m1 = sc.nextInt();

		int m2 = sc.nextInt();

		int m3 = sc.nextInt();
		
		int m4 = sc.nextInt();
		
		String result = getResult(m1,m2,m3,m4);
		
		System.out.println(result);
		
		
	}

}
