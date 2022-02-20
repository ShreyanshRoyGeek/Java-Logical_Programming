
public class Circle {

	
	 void area(double r)
	 {
		double area = 3.14* r *r;
		
		double circum = 2* 3.14*r;
		
		
		System.out.println("Radius is " + r);
		
		System.out.println("Area is " + area);
		
		System.out.println("Circumference is " +circum);
		
		System.out.println(" -------------- ");
	 }
	 
	 public static void main(String[] args) {
		
		 Circle c = new Circle();
		 
		 c.area(50);
		 c.area(4.5);
	}

}
