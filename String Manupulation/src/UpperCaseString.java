import java.util.Scanner;
public class UpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine();
		
		char []ch = st.toCharArray();

		String str ="";
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				ch[i] = (char)(ch[i]-32);
				
			}
			
			str = str+ch[i];
		}
		
		System.out.println(str);

	}

}
