import java.util.*;

public class Collection {

	public static void main(String[] args) {

		int arr [] = new int[] { 1,2,3,4};
		
		Vector<Integer> v = new Vector();
		
		Hashtable <Integer , String>  h = new Hashtable();
		
		v.add(4);
		
		v.add(5);
		
		v.addElement(5);
		
		h.put(5, "Shreyansh");
		
		h.put(10, "Asif");
		
		h.put(4, "Shivesh");
		
	
		System.out.println(v);
		
		System.out.println(h.get(5));	

	}

}
