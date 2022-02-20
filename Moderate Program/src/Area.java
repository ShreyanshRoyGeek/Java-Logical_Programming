
public class Area {

	int base;
	int height;
	double area;

	int radius;

	int width;
	int length;
	
	

	double area_triangle(int base,int height)
	{

		this.base = base;
		this.height = height;

		this.area  = (base*height)/2;
		System.out.println("Area of Triangle is "+ this.area);
		
		
		Person p = new Person();
		p.eat();
		
		return area;
	}


	void area_rectangle(int length,int width)
	{
		this.length = length;
		this.width = width;

		int area = (this.length*this.width);

		System.out.println("Area of Rectangle is "+area);

	}

	void area_circle(int radius)
	{
		this.radius = radius;

		this.area  = 3.14*(this.radius*this.radius);		

		System.out.println("Area of Circle is "+area);
	}

	void area_prism(int base, int height)
	{
		this.base = base;
		this.height = height;
		int area = 2*(base*2)+4*base*height; 

		System.out.println("Area of Prism is "+area);
	}




	public static void main(String[] args) {

		Area a = new Area();
		
		
		
		Person p = new Person();
		
		

		a.area_triangle(2,4);

		a.area_triangle(4,5);

		a.area_rectangle(5, 8);

		a.area_circle(5);

		a.area_prism(5, 7);
		
		p.eat();

	}

}
