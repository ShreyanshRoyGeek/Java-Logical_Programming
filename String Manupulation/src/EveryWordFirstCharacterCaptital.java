import java.util.Scanner;

public class EveryWordFirstCharacterCaptital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();

		char ch[] = str.toCharArray();

		for(int i=0; i<ch.length;i++)
		{
			if(i==0 && ch[i]!= ' ' || ch[i]!=' ' && ch[i-1] ==' ')
			{
				if(ch[i]>='a' && ch[i]<'z')
				{

					ch[i] = (char)(ch[i]-32);
				}
			}	

			else if(ch[i]>='A' && ch[i]<='Z')
			{

				ch[i] = (char)(ch[i]+32);
			}


		}

		String s1 = new String(ch);
		System.out.println(s1);



	}

}
