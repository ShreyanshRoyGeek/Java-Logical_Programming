/** This is my first interface program.  
    Interface is one of the most
    power-full tools in java. 
    We have to practice very hard to fully grasp Interface topic.  
**/ 
 
interface IMouse {

	
	static void click()
	{
		System.out.println("user click the interface to perform select operations");
	}
	
	
	void rightClick();
	void leftClick();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IMouse i = new IMouse(); // cannot instantiate interface
		
		click();
	
	}

}
