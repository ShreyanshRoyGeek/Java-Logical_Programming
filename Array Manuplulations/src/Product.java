import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of product you want to read ");
		int n = sc.nextInt();
		
		float pricearr[] = new float[n];
		
		System.out.println("Enter "+ n + " product price ");
		for(int i=0;i<n;i++)
		{
			pricearr[i] = sc.nextFloat();
		}
		
		float sum = 0;
		
		for(int i=0; i<n;i++)
		{
			sum += pricearr[i];
		}
		System.out.print("Total price of the entered product is ");
		System.out.println(sum);
		
		

	}

}
