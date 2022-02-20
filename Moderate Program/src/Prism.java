
public class Prism {
	
	int base;
	int height;
	
    void area(int base, int height)
    {
    	this.base = base;
    	this.height = height;
    	int area = 2*(base*2)+4*base*height; 
    	
    	System.out.println(area);
    }
    
    public static void main(String[] args) {
		
    	Prism p = new Prism();
    	
    	p.area(5, 4);
    	
	}
    
    
    

}
