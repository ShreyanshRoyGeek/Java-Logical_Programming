import java.util.Arrays;

public class Que {

	int capacity = 0;
	Object obj[];

	int front =-1, rear =-1;

	public Que(int capacity)
	{
		obj = new Object[capacity];
		int front = -1, rear = -1;

	}

	public Object push(Object ele)
	{

		if(rear == capacity-1)
		{

			System.out.println("Que overflow");
			return false;
		}

		obj[++rear] = ele;
		return true;
	}

	public Object pop()
	{
		if(front == -1)
		{
			System.out.println("Stack underflow");
		}

		return obj[front--];
	}

	public int size()
	{
		return rear- front;
	}

	public Object peek()
	{
		if(front == -1)
		{
			System.out.println("Stack underflow");
		}

		return obj[front];
	}



	@Override
	public String toString() 
	{
		String st = "[";

		for (int i = front; i <=rear; i++) {
			st = st  + obj[i];

			if(i<rear)
			{
				st = st+ ",";
			}
		}
		return st + "]";

	}	



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

