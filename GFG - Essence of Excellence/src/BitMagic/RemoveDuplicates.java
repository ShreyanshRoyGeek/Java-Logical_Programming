package BitMagic;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "gfgggfffh";
		
		String str2 = "";
		
		str2 = "" +str1.charAt(0);
		
		for(int i =1; i<str1.length();i++)
		{
			if(str1.charAt(i-1)!=str1.charAt(i))
			{
				str2 += str1.charAt(i);
				
			}
		}
		
		for(int i=0; i<str2.length();i++)
		{
			System.out.print(str2.charAt(i));
		}
		

	}

}
