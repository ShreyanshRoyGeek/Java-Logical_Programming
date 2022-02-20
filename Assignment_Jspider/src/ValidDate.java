import java.util.Scanner;

public class ValidDate {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the day, month, year ");

		int d = sc.nextInt();

		int m = sc.nextInt();

		int y = sc.nextInt();

		int feb = 28;

		if(y%400 == 0 && y%4 == 0 || y %100 != 0)
		{
			feb = 29;
		}


		boolean res = true;

		if(m < 0 || m>31)
		{
			res = false;
		}

		else if(d < 0 || d>31)
		{
			res = false;
		}

		else if((m == 4 || m ==6 || m== 9 || m==11) && d >30)
		{
			res = false;
		}

		else if(m ==2 && d>feb)
		{
			res = false;
		}



		if(res == true)
		{
			System.out.println("Valid Date");
		}

		else 
		{
			System.out.println("Inavalid date");
		}









	}

}
