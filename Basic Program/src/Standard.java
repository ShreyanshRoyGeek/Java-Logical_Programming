
public class Standard {
	
	String Name;
	int Marks;
	
	Standard(String s, int i)
	{
		Name = s;
		Marks = i;
		
	}
	
	void Display()
	{
		System.out.println(Name+" "+Marks);
	}

	public static void main(String[] args) {
		
		Standard s = new Standard("Shreyansh",86);
		Standard r = new Standard("Shivesh",88);
		
		s.Display();
		r.Display();
		
//		System.out.println(s.Name + " " + s.Marks);
//		System.out.println(r.Name + " " + r.Marks);

	}

}
