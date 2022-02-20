import java.util.Scanner;

public class SubStringPresentOrNot {

	static boolean isPresentOrNot(String str1,String str2)
	{
		char[] ch1 = str1.toCharArray();

		char[] ch2 = str2.toCharArray();

		for(int i =0;i<ch1.length;i++)
		{
			int k=i, j=0;

			while(j<ch2.length && k<ch1.length && ch1[k] == ch2[j]) 
			{

				k++;
				j++;
			}

			if(ch2.length == j)
			{
				return true;
			}


		}

		return false;

	}

	static int howManyTimesSubsringPresent(String str1, String str2)
	{
		char[] ch1 = str1.toCharArray();

		char[] ch2 = str2.toCharArray();

		int count = 0;
		for(int i =0;i<ch1.length;i++)
		{
			int k=i, j=0;

			while(j<ch2.length && k<ch1.length && ch1[k] == ch2[j]) 
			{

				k++;
				j++;
			}

			if(ch2.length == j)
			{
				count++;
				i = k-1;
			}
		}	


			return count;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub


			Scanner sc = new Scanner(System.in);

			String str1 = sc.nextLine(); 

			String str2 = sc.nextLine();

			//boolean res = isPresentOrNot(str1, str2);
			
			int res = howManyTimesSubsringPresent(str1, str2);

			System.out.println(res);

		}

	}
