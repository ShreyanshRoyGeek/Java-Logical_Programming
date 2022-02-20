
public class MainRunner {


	public static void main(String[] args) {

		Que mq = new  Que (5);

		mq.push(1);
		mq.push(2);
		mq.push(3);
		System.out.println(mq);

		mq.pop();
		//mq.peek();
		//mq.size();
		//mq.pop();
	}
}
