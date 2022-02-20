import java.util.Scanner;

public class EveryWord1stAndLastCharacterToCapitalAndRemainingSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();

		char ch[] = str.toCharArray();

		for(int i =0; i<ch.length;i++)
		{
			if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ')
				// Every word 1st character 
			{

				if(ch[i] >= 'a' && ch[i] <='z' )
				{
					ch[i] = (char) (ch[i]-32);

				}
			}


			else if(i == ch.length-1 && ch[i] != ' '|| ch[i] != ' ' && ch[i+1] == ' ')
				//  Last word last character and every word last character 
			{
				if(ch[i] >= 'a' && ch[i] <='z' )
				{
					ch[i] = (char) (ch[i]-32);

				}

			}
		}

		String s = new String(ch);

		System.out.println(s);

	}

}
