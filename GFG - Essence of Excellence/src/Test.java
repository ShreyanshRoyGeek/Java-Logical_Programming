
public class Test {
	
	static int add () throws InterruptedException
	{
		
		int a =5;
		
		int b =10;
		try
		{
			Thread.sleep(3000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		
		
		int c = a+b;
		
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add());

	}

}
