import java.util.Scanner;

public class Power {
	
	static long m1(long input1, long input2, long input3)
	{
		
		long pow = 1;
		for(int i =0; i<2; i++)
		{
			pow = pow*input1;
		}
		
		long c = (pow%input3);
		
		return c;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long input1 = sc.nextInt();
		long input2 = sc.nextInt();
		long input3 = sc.nextInt();
		
//		long pow = 1;
//		for(int i =0; i<input2; i++)
//		{
//			pow = pow*input1;
//		}
//		
//		long res = (pow%input3);
//		
//		System.out.println(res);
		
		long res = m1(input1,input2, input3);
		
		System.out.println(res);
		

	}

}
