package firstMultithreadingCode;

public class DisplayThread extends Thread{
	
	@Override
	public void run()
	{
		
		Sample s = new Sample();
		s.write();
				
	}

	

}
