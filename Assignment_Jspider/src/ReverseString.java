import java.util.*;

public class ReverseString {


	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter a string to reverse ");

		String s = sc.nextLine();

		
		/* -- Reverse the string using string inbuild methods  -- */
		
		//		String t = new String();
		//		
		//		for(int i = s.length()-1; i>=0;i--)
		//		{
		//			t = t + s.charAt(i);
		//		}
		//		
		//		System.out.println(t);


		/* --  Reverse the string using string buffer  -- */
		
		StringBuffer temp = new StringBuffer();

		temp.append(s);
		
		temp.reverse();
		
		System.out.println(temp);


	}


}
