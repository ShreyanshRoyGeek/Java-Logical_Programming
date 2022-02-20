import java.util.Scanner;

public class SwapEveryWordFirstCharacterToItsLastCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();  
 
		char ch[] = str.toCharArray();  
		
		int in =0; 
		
		for(int i=0; i<ch.length;i++)
		{
			
			if(i==0 && ch[i]!= ' ' || ch[i]!=' ' && ch[i-1] ==' ') 
				// Every Word 1st character

			{

				in =i;
			}

			else if(i == ch.length-1 && ch[i]!= ' ' || ch[i]!= ' ' && ch[i+1] == ' ')
				//last word last character and every word last character

			{

				char t = ch[i]; // last character
				ch[i] = ch[in]; // 1st character
				ch[in] = t;  
			}
		}

		String s1 = new String(ch);

		System.out.println(ch);
		
		

	}

}
