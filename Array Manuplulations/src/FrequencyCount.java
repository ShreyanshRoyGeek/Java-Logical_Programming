import java.util.Scanner;
public class FrequencyCount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int c[] = new int[10];

		do {
			c[n%10]++;
			n= n/10;

		}while(n!=0);

		int count=0;

		for(int i=0;i<10;i++)
		{
			if(c[i]>1)
			{
				count++;
			}
		}

		System.out.println(count);

	}

}
