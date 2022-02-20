import java.util.Scanner;

public class ReverseEveryWordInTheString {

	static void toReverseEveryWord(String st)
	{

		String W[] = st.split(" ");


		String str = "";
		
		for(int i=0; i<W.length; i++)
		{

			str = W[i];
			
			for(int j=str.length()-1; j>=0; j--)
			{

				System.out.print(str.charAt(j));

			}
			System.out.print(" ");

		}	


	}
	
	static void reverseString(String str)
	{
		for(int j=str.length()-1; j>=0; j--)
		{

			System.out.print(str.charAt(j));

		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine(); 
		
		toReverseEveryWord(st);
		
		//reverseString(st);


	}

}
