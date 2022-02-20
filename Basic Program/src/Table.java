
public class Table {
	
	int n;
	
	Table(int n)
	{
	    this.n = n;
	    
	    int i;
	    
	    for(i=1;i<=10;i++)
	    { 
	    	int y = n*i;
	    	
	    	System.out.println(this.n + "*" + i + " " + y);
	    	
	    }
	    
	    System.out.println("----------------");
	    
	}
	
	public static void main(String[] args) {

		Table t1 = new Table(5);

		Table t2 = new Table(6);
	}
}
