import java.util.*;

public class Anagrams {

	static void StringAnagrams()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String " );

		String s1 = sc.nextLine();

		System.out.println("Enter second String ");

		String s2= sc.nextLine();

		//		String s1 = "Ram Aam khata h";
		//		
		//		String s2 = "aam Ram Khata h";
		
		
		//      String s1 = "Keep";
		//      String s2 = "Peak";
		
		
		
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();


		if(s3.length() != s4.length())
		{
			System.out.println("Strings are not anagrams ");

		}



		else
		{
			// Converting all the elements to character array

			char[] string1 = s3.toCharArray();

			char[] string2 = s4.toCharArray();


			// Sorting the array 

			Arrays.sort(string1);

			Arrays.sort(string2);

			if(Arrays.equals(string1, string2) == true)

				System.out.println("The two strings are anagrams ");


			else

				System.out.println("The two strings  are not anagrams ");

		}


	}

	static void Anagrams2()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first String " );

		String s1 = sc.nextLine();

		System.out.println("Enter second String ");

		String s2= sc.nextLine();
		
		boolean b;
		
		/* -- Wrong Logic --  */
		if (b = (s1.length() == s2.length()))
		{
			System.out.println("The two strings are anagrams ");
			System.out.println(b);
		}
		
		else
		{
			System.out.println("The two strings  are not anagrams ");
			//System.out.println(b);
		}
	}

	public static void main(String[] args) {

		//StringAnagrams();
		
		StringAnagrams();

	}
}
