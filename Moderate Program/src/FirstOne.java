
public class FirstOne
{
	String Details;
	
    FirstOne()
    {
    	System.out.println("First you have to complete the basic program ");
    }
    
    FirstOne(String Details)
    {
    	this.Details = Details;
    	
    	System.out.println("First you have to complete the basic program from JavaPoint"
    			+ " Then you will easily go through GFG, LeetCode and HackerRank for Standard program on DS and ALGO ");
    }
    
    public static void main(String[] args) {
	
    	FirstOne f = new FirstOne();
    	
    	System.out.println();
    	
    	FirstOne g = new FirstOne("Shreyansh");
    	
    	g.action();
    	
    	System.out.println("Details about " + g.Details +" Progress in Programming " );
    	
	}
    
    void action()
    {
    	
    	System.out.println("Right now " + Details +" is stuck at Basic Programming ");
    	
    }
}
