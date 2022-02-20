/* Number of Words */

import java.util.Scanner;

public class NoOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		
		char ch[] = st.toCharArray();
		
		int count = 0;
		
		for(int i=0; i<ch.length; i++)
		{
			if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ')
			{
				count++;
			}
			
		}
		
		System.out.println("Number of words "+ count);
		

	}

}
