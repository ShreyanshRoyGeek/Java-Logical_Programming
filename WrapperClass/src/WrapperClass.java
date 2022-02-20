
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int i = 20;
		Integer ii = new Integer(20);
		System.out.println(ii);
		
		
		/* Auto-Boxing */
		
		double d  = 23.4;
		
		Double dd = d;
		
		System.out.println(dd);
		
		
		/* Auto-Unboxing */
		
		double f  =  dd;

		
		
		/* Using parse method */
		
		String s = "20";
		short ss = Short.parseShort(s);
		System.out.println(ss);
		
		

	}

}
