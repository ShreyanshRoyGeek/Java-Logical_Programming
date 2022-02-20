import java.util.Scanner;

public class PalindromInString {  // Without Reverse Method
	

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

		String st = sc.nextLine(); // MADAM, LEVEL

		boolean res = isPalindrome(st);
		
		System.out.println(res);


	}

}
