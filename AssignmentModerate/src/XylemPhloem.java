import java.util.Scanner;

public class XylemPhloem {

	static boolean  isXylem(int n)
	{
		int t = n;

		int os = 0, ms = 0;
		do
		{
			int r = t%10;

			if(t == n || t == r)
			{
				os = os + r;
			}

			else

				ms = ms + r;

			t = t/10;

		}while(t!=0);


		return(ms == os);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		if(isXylem(n) == true)
		
			System.out.println("Number is xylem ");
		
		
		else
			System.out.println("Number is phloem");

	}

}
