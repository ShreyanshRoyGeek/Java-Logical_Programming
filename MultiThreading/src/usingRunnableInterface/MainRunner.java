package usingRunnableInterface;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		
		t1.start();
		

	}

}
