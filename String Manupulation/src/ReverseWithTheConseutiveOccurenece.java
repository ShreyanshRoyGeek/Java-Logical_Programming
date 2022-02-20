import java.util.Scanner;

public class ReverseWithTheConseutiveOccurenece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();  // I/p --> Apple and O/p --> Ellpa
		int count[] = new int[26];
		
		for(int i =0; i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count[ch-65]++;
				
			}
			
			else if(ch>= 97 && ch<=122)
			{
				count[ch-97]++;
			}
		}
		
		for(int i =0; i<26;i++)
		{
			if(count[i] == 0)
			{
				continue;
			}
			
			int k =i;
			i++;
			
			while(i<26 && count[i] == 0)
			{
				i++;
			}
			
			if(i!=26)
			{
				count[k] = 65 +i;
				count[i] = 65+k;
			}
		}
		
		String rs = "";
		for (int i = 0; i < st.length(); i++) {
			
			char ch = st.charAt(i);
			
			if(ch>=97 && ch<=122)
			{
				rs = rs+ (char) + (count[ch-97]+ 32);
			}
			
			else if(ch>=65 && ch<= 90)
			{
				rs = rs+ (char) + (count[ch-65]);
			}
			
			else
				rs = rs+ch;
			
		}
		
		System.out.println(rs);

	}

}
