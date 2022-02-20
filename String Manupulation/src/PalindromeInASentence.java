import java.util.Scanner;

public class PalindromeInASentence {
	
	static int countPalindrome(String st)
	{
		
		String W[] = st.split("");
		
		int count =0;
		
		for(int i=0; i<W.length; i++)
		{
			if(isPalindrome(W[i]) == true)
			{
				count++;
			}
		}
		
		return count;
	}
	
	static boolean isPalindrome(String st)
	{
		
		char ch[] = st.toCharArray();
		
		int i =0; int j = st.length()-1;
		
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				return false;
				
			}
			
			i++;
			j--;
			
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine(); // MADAM LEVEL , 
		
		int res = countPalindrome(st);
		
		System.out.println(res);

	}

}
