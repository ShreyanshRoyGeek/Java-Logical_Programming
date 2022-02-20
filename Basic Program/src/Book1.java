
public class Book1 {
	
	String Colour;
	int Pages;
	
	Book1(String Colour, int Pages)
	{
		this.Colour = Colour;
		this.Pages = Pages;
	}
	
	public static void main(String[] args) {
		
		Book1 b1 = new Book1("Red",250);
		Book1 b2 = new Book1("White",400);
		
		System.out.println(b1.Colour + " " + b1.Pages);
		
	}

}
