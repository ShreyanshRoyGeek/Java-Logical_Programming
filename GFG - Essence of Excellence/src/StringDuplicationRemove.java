import java.util.*;
import java.io.*;

public class StringDuplicationRemove {
	
	static String removeDups(String S)
	{
		
		char[]ch = S.toCharArray();
		
		String str = "";
		LinkedHashSet<Character> lhs = new LinkedHashSet();
		
		for(char i : ch)
		{
			lhs.add(i);
		}
		
		for(char i : lhs)
		str += i;
		
		return str;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(read.readLine());
		
		while(t-->0)
		{
			String s = read.readLine();
			
			//Solution ob = new Solution();
			
			String result = removeDups(s);
			
			System.out.println(result);
			
			
		}
		
		

	}

}
