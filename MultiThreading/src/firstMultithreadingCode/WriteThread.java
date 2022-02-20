package firstMultithreadingCode;

public class WriteThread extends BasicThread {

	@Override
	public void run()
	{
		
		Sample s = new Sample();
		s.display();
				
	}

}
