import java.util.Scanner;

public class ConvertLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		
		String str = "";
		
		char ch[] = st.toCharArray();
		
		
		for(int i =0; i<ch.length;i++)
		{
			
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i]= (char)(ch[i]+ 32);
			}
			
			
				str = str + ch[i];
		}
		
		System.out.println(str);

	}

}
