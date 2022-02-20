import java.util.Scanner;

public class StringAnagrams {
	
	
	static int[] countFrequencyOfEachVowel(String str)
	{
		int[] count = new int[26];

		for(int i=0; i<str.length(); i++)
		{

			char ch = str.charAt(i);

			if(ch>='A' && ch<= 'Z')
				count[ch-65]++; // It adds at index 0 to 25;

			else if(ch>='a' && ch<= 'z')
				count[ch-97]++; // It adds at index 0 to 25;

		}

		return count;
	}
	
	
	static boolean isAnagram(String str1, String str2)
	{
		
		int c1[] =  countFrequencyOfEachVowel(str1);
		
		int c2[] = countFrequencyOfEachVowel(str1);
		
		for(int i=0; i<26; i++)
		{
			if(c1[i] != c2[i])
			{
				return false;
			}
			
		}
			
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		String str1 = sc.nextLine(); 
		
		String str2 = sc.nextLine(); 
		
		//str1 = str1.toLowerCase();
		//str2 = str2.toLowerCase();
		
		
		
		boolean rs = isAnagram(str1, str2);
		
		if(rs)
		
			System.out.println("String is Anagram");
		
		
		else
			System.out.println("String is not Anagram");
		
	}

}
