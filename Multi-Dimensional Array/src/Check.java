import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		str1.toLowerCase();
		
		//char ch1[] = str1.toCharArray();
		
		String str2 = sc.nextLine();
		str2.toLowerCase();
		
		
		String s = str1+ str1;
		s.toLowerCase();
		
		//char ch2[] = str2.toCharArray();
		
		System.out.println(s.contains(str2));
		
			//System.out.println("yes");
		
			//System.out.println("no");

	}

}
