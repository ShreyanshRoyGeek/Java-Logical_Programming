import java.util.Scanner;

public class StringContainerVirtusa {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		
		String rs[]=new String[s1.length()];
		
		for(int i=0;i<rs.length;i++) {
			
			String s=s1;
			
			String word=sc.next();
			
			for(int j=0;j<word.length();j++) 
			{
				
				char ch=word.charAt(j);
				int in=s1.indexOf(ch);
				if(in==-1) 
				{
					s1=s;
					rs[i]="no";
					break;
				}
				else {
					s1=s1.substring(0,in)+s1.substring(in+1);
				}
			}
			if(rs[i]==null)
				rs[i]="yes";
		}
		for(int i=0;i<rs.length;i++)
			System.out.println(rs[i]);

	}

}