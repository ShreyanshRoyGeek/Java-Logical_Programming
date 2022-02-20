
public class Rectangle {

	int width;
	int length;
	
	void area(int length,int width)
	{
		this.length = length;
		this.width = width;
		
		int area = (this.length*this.width);
		
		System.out.println(area);
		
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.area(4, 5);
		
	}
	


}
