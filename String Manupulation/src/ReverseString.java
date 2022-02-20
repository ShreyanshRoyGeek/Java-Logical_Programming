import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al1 = new ArrayList<>(5);
		al1.add("Shreyansh");
		al1.add("Shreyansh");
		al1.add("Shreyansh");
		al1.add("Shreyansh");
		al1.add("Shreyansh");
		al1.add("Shreyansh");
		al1.add("Shreyansh");
		al1.add(4,"Shivesh");
		
		System.out.println(al1);
		
		//String s[] = new String[1];
		
		String s = "Shreyansh";
	
		
		for(int i = s.length()-1 ; i>= 0; i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
