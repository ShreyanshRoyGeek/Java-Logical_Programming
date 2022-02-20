import java.util.Scanner;

public class EldestPersonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of person age you want to read ");
		int n = sc.nextInt();
		
		int[] age = new int[n];
		
		System.out.println("Enter the "+ n + " person age");
		for(int i=0; i<n; i++)
		{
			age[i]= sc.nextInt();
		}
		
		
		int max = age[0]; int min = age[0];
		
		for(int i=0; i<n;i++)
		{
			if(age[i]>max)
			{
				max = age[i];
			}
			
			else if(age[i]<min)
			{
				min = age[i];
			}
		}
		
		System.out.print("The minimum and maximum age are ");
		System.out.println(min + " and " + max);
		
		
		
		

	}

}
