
public class BasicThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		System.out.println(t1);
		
		t1.setName("Shreyansh");
		
		System.out.println(t1);
		
		Thread t2 = Thread.currentThread();
		
		System.out.println(t2);
		
		t2.setName("Main Method");
		
		System.out.println(t2);
		
	}

}
