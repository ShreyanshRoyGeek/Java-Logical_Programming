import java.util.Scanner;

public class StringFrequencyCountII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();
		
		String string = str.toLowerCase();
		
		int count[] = new int[128];
		
		for(int i =0; i<string.length(); i++)
		{
			
			char ch = string.charAt(i);
			count[ch]++;
		}
		
		for(int i =0; i<count.length;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)i + "==>" + count[i]);
			}
			
		}

	}

}
