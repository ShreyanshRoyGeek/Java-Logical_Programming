
public class PalindromeWithinN {
	
	static void threeDigitPalindrome()
	{
		for(int i =1; i<=9; i++)
		{
			for(int j=0;j<=9;j++)
			{
				System.out.print("" + i+ j+ i  + " ");
			}
			
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		threeDigitPalindrome();

	}

}
