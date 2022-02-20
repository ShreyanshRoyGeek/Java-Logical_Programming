
public class Inner {
	
	int a=5,b=4;
	
	void multiply()
	{
		int mul = a*b;
		System.out.println("multilication is "+mul);
	}
	
	class Inner2 {
		
	     int x=5,y=5;
	     
	     void sum()
	     {
	    	 int sum = x+y;
	    	 System.out.println("sum is " + sum);
	     
	    }
		
	}

	public static void main(String[] args) {
		
		Inner i = new Inner();
		
		Inner2 j = i.new Inner2();
		
		j.sum();
		
		i.multiply();
		
	}

}
