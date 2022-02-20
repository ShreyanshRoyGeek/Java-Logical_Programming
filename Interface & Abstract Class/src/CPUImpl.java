
public class CPUImpl implements IMouse {

	
	public void click() {
		// TODO Auto-generated method stub
		
		System.out.println("The app/resource gets selected ");
	}
	
	

	@Override
	public void rightClick() {
		// TODO Auto-generated method stub
		
		System.out.println("Display options ");
	}

	@Override
	public void leftClick() {
		// TODO Auto-generated method stub
		
		System.out.println("The app/resource gets opened ");
		
	}
	
	public static void main(String[] args) {
		
		IMouse c = new CPUImpl();
		
		//c.click();
		c.rightClick();
		c.leftClick();
		
		//Imouse.click();
		
		System.out.println();
		System.out.println("Congrats, You have successfully implement your first Interface project ");
		System.out.println("Keep practicing and keep coding ");
	}
	
	

}
