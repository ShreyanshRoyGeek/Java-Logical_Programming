import java.util.Scanner;
public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int nsc=0;
		
		for(int i=0; i<str.length(); i++) 
		{
			char ch = str.charAt(i);
			
			if(!(ch>='A' && ch<= 'Z' || ch>='a' && ch<= 'z' ||  ch>='0' && ch<= '9'))
			
				nsc++;
						
				
		}
		
	
		System.out.println(nsc);
				

	}

}
