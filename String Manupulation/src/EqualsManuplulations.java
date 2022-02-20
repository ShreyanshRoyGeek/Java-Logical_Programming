
public class EqualsManuplulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EqualsManuplulations  e1 = new EqualsManuplulations();
		
		EqualsManuplulations  e2 = new EqualsManuplulations();
		
		EqualsManuplulations  e3 = e1;
		
		System.out.println(e1.equals(e2));
			
		System.out.println(e1.equals(e3));
		
		
		System.out.println(e1==e2);
		
		System.out.println(e2==e3);
		
		System.out.println(e1==e3);
		
		System.out.println(new EqualsManuplulations() == new EqualsManuplulations());
		
	
	}

}
