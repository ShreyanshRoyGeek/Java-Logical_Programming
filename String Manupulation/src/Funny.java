import java.util.Scanner;

public class Funny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the initial values");
		int value = sc.nextInt();

		System.out.println("Enter operation sequence");
		String st = sc.next();
		
		
		int v[] = new int[26];
		
		
		for(int i =0; i<st.length();i++)
		{
			char ch = st.charAt(i);

			switch(ch)
			{
			case 'A': 
				if(v[ch-65] == 0)
				{
					System.out.println("Enter the value of A");
					v[ch-65] = sc.nextInt();
				}

				value = value + v[ch-65];
				break;


			case 'M': 
				if(v[ch-65] == 0)
				{
					System.out.println("Enter the value of M");
					v[ch-65] = sc.nextInt();
				}

				value = value * v[ch-65];
				break;	

			case 'S': 
				if(v[ch-65] == 0)
				{
					System.out.println("Enter the value of S");
					v[ch-65] = sc.nextInt();
				}

				value = value - v[ch-65];
				break;

			case 'D': 
				if(v[ch-65] == 0)
				{
					System.out.println("Enter the value of D");
					v[ch-65] = sc.nextInt();
				}

				value = value/v[ch-65];
				break;	

			}

		}
		
		System.out.println(value);

	}

}
