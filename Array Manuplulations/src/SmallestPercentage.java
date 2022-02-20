import java.util.Scanner;

public class SmallestPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of values you want to read ");
		int n = sc.nextInt();
		
		
		String perStr[] = new String[n];
		
		//int perInt[] = new int[n];
		
		double perInt[] = new double[n];
		
		System.out.println("Enter the "+ n + " percentages ");
		for(int i = 0; i<n; i++)
		{
			perStr[i] = sc.next();
		}
		
		for(int i=0; i<n; i++)
		{
			perInt[i] =  Double.parseDouble(perStr[i]);
			
		}
		
		double min = perInt[0];
		
		for(int i =0; i<n; i++)
		{
			if(perInt[i]<min)
				min = perInt[i];
		}
		
		System.out.println("The minmum element is " + min);
				

	}

}
