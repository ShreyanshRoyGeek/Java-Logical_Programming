
public class Book {
	
	String Title;
	String Author;
	
	Book() //Non-Parameterized Constructor;
	{
		Title =  "Think_Big and Groww_Big";
		Author = "Isaac";
		
		
		System.out.println(Author);
		System.out.println(Title);
		
	}
	
	public static void main(String[] args) {
		
		Book b = new Book();
		Practice p1 = new Practice();
		
		
		System.out.println("Name -"+ p1.Name);
		
//		System.out.println(b.Title);
//		System.out.println(b.Author);
//		
	}

}
