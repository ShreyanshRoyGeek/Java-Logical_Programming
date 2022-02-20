import java.util.Scanner;

public class StringPangrams {

	static int[] countFrequencyOfEachVowel(String str)
	{
		int[] count = new int[26];

		for(int i=0; i<str.length(); i++)
		{

			char ch = str.charAt(i);

			if(ch>='A' && ch<= 'Z')
				count[ch-65]++;

			else if(ch>='a' && ch<= 'z')
				count[ch-97]++;

		}

		return count;
	}
	
	static boolean isPangram(String str)
	{
		
		int count[] = countFrequencyOfEachVowel(str);
		
		for(int i=0; i<count.length; i++)
		{
			if(count[i] == 0)
			{
				return false;
			}
		}

		return true;
	}
	
	static boolean isPangramII(String str)
	{
		str = str.toLowerCase();
		
		for(char ch = 'a'; ch<='z'; ch++)
		{
			if(str.indexOf(ch) == -1)
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	static boolean isAnagram(String str1, String str2)
	{
		
		int c1[] =  countFrequencyOfEachVowel(str1);
		
		int c2[] = countFrequencyOfEachVowel(str1);
		
		for(int i=0; i<26; i++)
		{
			if(c1[i] != c2[i])
			{
				return true;
			}
			
		}
			
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine(); // A quick brown fox jumps over the lazy dog
		
		boolean rs = isPangram(str);
		
		if(rs)
		
			System.out.println("String is Pangram");
		
		
		else
			System.out.println("String is not Pangram");
			

	}

}
