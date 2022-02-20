import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);

		String str = sc.nextLine();

		int vc=0,cc =0;

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			
			if(ch>='A'&& ch<='Z' || ch>='a' || ch<='z')
			{
				
				if((ch=='A'|| ch =='a') || (ch=='E'|| ch =='e') || (ch== 'I' || ch == 'i') ||
						(ch== 'O' || ch== 'o') || (ch== 'U' || ch == 'u'))
				{
					vc++;
				}

				else

					cc++;
				
			}


		}
		
		System.out.println(vc);
		System.out.println(cc);
	}	

}
