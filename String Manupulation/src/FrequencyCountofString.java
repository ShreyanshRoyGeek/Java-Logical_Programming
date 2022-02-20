import java.util.Scanner;

public class FrequencyCountofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 

		String str = sc.nextLine();
		
		//String string = str.toLowerCase();
		
		char ch[] = str.toCharArray();
		
		int count = 1;
		for(int i =0; i<ch.length;i++)
		{
			if(ch[i] != '!')
			{
				
				for(int j =i+1; j<ch.length;j++)
				{
					
					if(ch[i] == ch[j])
					{
						count++;
						ch[j] = '!';
					}
					
				}
				
				System.out.println(ch[i]+ "-->"+ count);
				
			}
			
		
			
		}
		

	}

}
