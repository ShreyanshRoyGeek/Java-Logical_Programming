import java.util.Scanner;

public class Main1 {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String res = decToBin(n);

		System.out.println(res);


	}

}
