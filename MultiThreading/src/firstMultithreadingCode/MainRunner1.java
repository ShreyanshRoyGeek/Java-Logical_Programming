package firstMultithreadingCode;

public class MainRunner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");

		DisplayThread dt = new DisplayThread();
		WriteThread wt = new WriteThread();

		dt.start();
		wt.start();


		System.out.println("Main method end");




	}

}
