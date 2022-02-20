import java.util.Scanner;

public class SumOfDigitInTheString {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine();

		char []ch = st.toCharArray();

		int sum =0; //int digit =0;

		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] >= '0' && ch[i] <= '9')

			{
				
				//digit = Integer.parseInt("ch[i]"); // ch[i] is not a string.
				//digit = (int) (ch[i]); // it returns the ASCII value.

				sum = sum + ch[i]-48;
			}

		}
		
		

		System.out.println(sum);


	}

}
