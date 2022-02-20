package capitalAndSmallLetterUsingThread;

public class CapitalThread extends Thread {
	
	@Override
	public void run()
	{
		for(char ch = 'A'; ch<= 'Z';ch++)
		{
			System.out.println(ch);
			
			try {
				
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e)
			{
				System.out.println(e);
				//e.printStackTrace();
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
