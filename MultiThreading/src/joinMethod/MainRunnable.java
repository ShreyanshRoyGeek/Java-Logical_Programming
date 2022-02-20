package joinMethod;

public class MainRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyRunnable my = new MyRunnable();
		
		Thread t1 = new Thread(my,"Java");
		Thread t2 = new Thread(my,"Python");
		Thread t3 = new Thread(my,"JavScript");
		
		t1.start();
		
		t1.join(5000);
		
		t2.start();
		t2.join();
		
		t3.start();
		Thread.sleep(6000);
		
		t1.suspend();
		Thread.sleep(5000);
		t1.resume();
		
		
		
		
		
		
		
	}

}
