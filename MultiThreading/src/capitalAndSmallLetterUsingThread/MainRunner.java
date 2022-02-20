package capitalAndSmallLetterUsingThread;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CapitalThread c = new CapitalThread();
		
		SmallThread s = new SmallThread();
		
		c.start();
		s.start();
		
		

	}

}
