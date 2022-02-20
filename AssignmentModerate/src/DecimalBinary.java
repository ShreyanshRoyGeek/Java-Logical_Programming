import java.util.Scanner;

public class DecimalBinary {

	static String decToBin(int n)
	{
		String bin = "";

		do{
			int r = n%2;
			bin = r + bin;
			n = n/2;
		} while(n!=0);

		return bin;
	}

	static String decToOct(int n)
	{
		String bin = "";

		do{
			int r = n%8;
			bin = r + bin;
			n = n/8;
		} while(n!=0);

		return bin;
	}

	static String decToHexa(int n)
	{
		String bin = "";

		do{
			int r = n%16;
			if(r<10)
			{
				bin = r + bin;
			}

			else 
			{
				bin = (char)(r+55)+bin;
			}


			n = n/16;
		} while(n!=0);

		return bin;
	}

	static int  binToDec(int n)
	{
		int dec = 0, p = 1;

		do
		{
			int r = n%10;

			//dec = dec+ r* pow(r,count)// Power method, count++;

			dec = dec + r*p;
			p = p*2;
			n = n/10;

		}while(n!=0);

		return dec;
	}

	static int  octToDec(int n)
	{
		int dec = 0, p = 1;

		do
		{
			int r = n%10;
			dec = dec + r*p;
			p = p*8;
			n = n/10;

		}while(n!=0);

		return dec;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = octToDec(n);

		System.out.println(res);


	}

}
