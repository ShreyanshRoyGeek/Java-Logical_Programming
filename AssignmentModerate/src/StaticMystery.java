
public class StaticMystery {
	
	void m1()
	{
		System.out.println("Print m1");
		
		m2();
	}
	
	static void  m2()
	{
	
		System.out.println("Print static m2");
	}
	
	
	
	public static void main(String[] args) {
		
		StaticMystery s = new StaticMystery();
		
		s.m1();
		
		
	}

}
