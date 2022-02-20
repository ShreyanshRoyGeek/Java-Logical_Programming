
public class FanImpl extends BulbImpl implements ISwitch, IRegulator  {

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		
		System.out.println("Increase the fan speed ");
		
	}

	@Override
	public void reduceSpeed() {
		// TODO Auto-generated method stub
		
		System.out.println("Decrease the fan speed ");
		
	}

	@Override
	public void onSwitch() {
		// TODO Auto-generated method stub
		
		System.out.println("On the fan switch");
		
	}

	@Override
	public void offSwitch() {
		// TODO Auto-generated method stub 
		
		System.out.println("Off the fan switch");
		
	}
	
	public static void main(String[] args) {
		
		FanImpl f = new FanImpl();
		
		//ISwitch f = new FanImpl();
		
		//IRegulator f = new FanImpl();
		
		f.offSwitch();
		f.onSwitch();
		
		f.increaseSpeed();
		f.reduceSpeed();
		
		System.out.println();
		
		System.out.println("Keep practicing and keep coding like a geek ");
		System.out.println("Arise, awake and stop not till the goal is being reached ");
		
	}
	
}
