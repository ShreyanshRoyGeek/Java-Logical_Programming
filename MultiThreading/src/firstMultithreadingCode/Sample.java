package firstMultithreadingCode;

public class Sample {
	
	void display()
	{
		for(int i =1; i<10; i++)
		{
			
			System.out.println(i + "display");
			
			if(i ==5)
			{
				try
				{
					BasicThread.sleep(3000);
					
				}
				
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		}
		
	}
	
	void write()
	{
		for(int i =1; i<10; i++)
		{
			System.out.println(i +"write");
		}
	}
	
	

}
