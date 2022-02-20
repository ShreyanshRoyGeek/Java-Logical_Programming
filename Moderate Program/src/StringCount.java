
public class StringCount {
	
	String s[];
	
	void string_count(String s[])
	{
		this.s = s;
		
		int i = 0;
		
		while(s[i] !=  null)
		{
			
			i++;
		}
		
		System.out.println("Length of the string is " + i);
	}
	
	public static void main(String[] args) {
		
		StringCount c = new StringCount();
		
		String s[] = new String[] {"Shreyansh Roy"};
		
		c.string_count(s);
			
	}

}
