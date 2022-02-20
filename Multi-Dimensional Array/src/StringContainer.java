import java.util.Scanner;

public class StringContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next(); // K,E,E,P
		
		int n = sc.nextInt(); //1
		
		String rs[] = new String[n];
		
		for(int i =0; i<n; i++)
		{
			String s = s1;
			
			String word = sc.next(); //PEAK
			
			for(int j =0; j<word.length();j++)
			{
				char ch = word.charAt(j);
				
				int in = s1.indexOf(ch);
				
				if(in==-1)
				{
					s1 = s;
					rs[i] = "NO";
					break;
					
				}
				
				else
				{	
					s1 = s1.substring(0, in) + s1.substring(in+1); // in'th index removed
				}
			
			}
			if(rs[i] == null)
			{
				rs[i] = "YES";
			}
			
		}
		
		for(int i =0; i<rs.length;i++)
		{
			System.out.println(rs[i]);
			
		}
		

	}

}
