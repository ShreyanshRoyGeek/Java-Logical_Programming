
public class Circle {
	
	int radius;
	double area;
	
	
	
	void area(int radius)
	{
		this.radius = radius;
		
		this.area  = 3.14*(this.radius*this.radius);		
				
		System.out.println(area);
	}
	
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.area(5);
		c1.area(6);
	}
	

}
