import java.util.Scanner;

public class SpecialDigit {

	static void specialDigit() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two digit number");

		int a = sc.nextInt();
		
		int temp[] = new int[5];
		
		int i=0;
		
		int count = 0;
		
		while(a!=0)
		{
			temp[i] = a%10;
			
			i++;
			
			count++;
			
			a= a/10;
			
		}
		
		int sum = 0;
		
		for(i=0;i<=count;i++)
		{
			sum = sum + (temp[i] + temp[i+1] + temp[i]*temp[i+1]);
		}

		System.out.println(sum);


	}
	
	public static void main(String[] args) {
		
		specialDigit();
	}

}
