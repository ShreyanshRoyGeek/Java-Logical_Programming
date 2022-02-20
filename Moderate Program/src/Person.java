
public class Person {
	
	void eat()
	{
		System.out.println("person eats");
		
		hand_wash();
		
		serve_food();
		
	}
	
	void hand_wash()
	{
		System.out.println("wash hnads");
		
	}
	
	void serve_food()
	{
		System.out.println("food is served");
		
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.eat();
	}

}
