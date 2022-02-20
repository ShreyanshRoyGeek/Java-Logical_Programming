import java.util.Scanner;

public class FrequencyOfEachAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();
		
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<= 'Z')
				count[ch-65]++;
			
			else if(ch>='a' && ch<= 'z')
				count[ch-97]++;
	
		}
		
		for(int i=0; i<count.length;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)(i+65) + " ==> " + count[i]);
			}
			
		}

	}

}
