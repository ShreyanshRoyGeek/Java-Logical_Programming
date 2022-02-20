package Test;
import TestPackage.Test;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vector  v = new Vector();
		
		Vector<String> vi = new Vector<String>();
		
		Vector<Integer> vec = new Vector<>();  
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Shivesh");
		al.add("Shreyansh");
		al.add("Sanjeev Roy");
		al.add("Pushpa Roy");
		
		System.out.println(al.indexOf("Shivesh"));
		System.out.println(al.indexOf("Sanjeev Roy"));
		
		
		System.out.println(al);
		
		vec.add(5);
		vec.add(8);
		
		System.out.println(vec);
		
		vi.add("Mother");
		vi.add("Father");
		
		System.out.println(vi);
				
	}

}
