import java.util.Scanner;

public class ReverseEveryWordOfString {

	static String toReverseEveryWord(String st)
	{
		String str = "";

		char ch[] = st.toCharArray();

		for(int i=0; i<ch.length;i++)
		{

			int k =i;

			while(i<ch.length && ch[i] != ' ') //Every word
			{
				i++;	
			}

			int j = i-1;

			while(j>=k)
			{
				str = str+ ch[j]; //Every Word Reverse 
				j--;
			}

			if(i<ch.length)
			{
				str = str + ch[i]; // To add space
			}

		}

		return str;

	}

	static String toReverseSentence(String st)
	{

		char ch[] = st.toCharArray();

		String str = "";

		int k = 0;

		int j = ch.length-1;

		while(j>=k)
		{
			str = str + ch[j];
			j--;
		}



		return str;
	}

	static String toReverseSentenceClass(String st)
	{

		String str = "";

		char ch[] = st.toCharArray();
		
		
		for(int i=ch.length-1; i>=0;i--)
		{

			int k =i;

			while(i>=0 && ch[i] != ' ') //Every word
			{
				i--;	
			}

			int j = i+1;

			while(j<=k)
			{
				str = str+ ch[j]; //Every Word Reverse 
				j++;
			}

			if(i>=0)
			{
				str = str + ch[i]; // To add space
			}

		}
		return str;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine(); 

		String res = toReverseSentence(st);

		System.out.println(res);




	}

}
