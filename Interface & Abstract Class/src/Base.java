
public class Base extends Demo {
	
	@Override
	void fun()
	{
		System.out.println("Programming is fun ");
	}

	
	void practice()
	{
		System.out.println("Consistency and practice is the key to be proficient in coding ");
	}
	
	public static void main(String[] args) {
		
		Base b = new Base();
		
		b.fun();
		
		b.practice();
		
		Demo d = new Base();
		
		d.fun();
			
	}

}
