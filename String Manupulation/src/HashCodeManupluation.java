
public class HashCodeManupluation {
	
	int id; double marks; String Name;
	
	
	
	public HashCodeManupluation(int id, double marks, String name) 
	{
		super();
		this.id = id;
		this.marks = marks;
		Name = name;
	}

	public int hashCode()
	{
		return this.id;
		
	}
	
	public boolean equals(Object obj)
	{
		HashCodeManupluation h = (HashCodeManupluation)obj;
		return this.id == h.id;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashCodeManupluation h1 = new HashCodeManupluation(12, 76.8, "Shivesh");
		
		HashCodeManupluation h2 = new HashCodeManupluation(13, 75.8, "Shreyansh");
		
		HashCodeManupluation h3 = h1;
		
		
		System.out.println(h1.hashCode());
		
		System.out.println(h2.hashCode());
		
		System.out.println(h1.equals(h2));
		
		System.out.println(h3.equals(h1));
		
					

	}

}
