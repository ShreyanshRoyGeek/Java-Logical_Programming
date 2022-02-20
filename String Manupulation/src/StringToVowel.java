/* Convert string to vowels string   */

import java.util.Scanner;

public class StringToVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		
		String str ="";
		
		String v = "aeiouAEIOU";
		
		for(int i =0; i<st.length(); i++)
		{
			char ch = st.charAt(i);
			
			if(v.indexOf(ch) == -1)
			{
				str = str +ch;
			}
		}
		
		System.out.println(str);

	}

}
