import java.util.Scanner;

public class ConcatAndReverseString {
	
	static String conRevstr(String S1, String S2) {
        // code here
		
        String s = S1+S2;
        String sRev = "";
        
        char ch[] = s.toCharArray();
        
        for(int i=s.length()-1; i>=0;i--)
        {
            
            ch[i] = s.charAt(i);
            sRev = sRev + ch[i];
            
            
        }
        
        
        
        return sRev;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		
		
		String res = conRevstr(S1,S2);
		System.out.println(res);
		

	}

}
