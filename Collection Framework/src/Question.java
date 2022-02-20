import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); 
		
		int arr[] = new int[10];

		
		int i =0; int temp =0;
		int k =1;
		do{

			int re = n%10;

			temp =(k*re);
			
			System.out.println(temp);
			
			k = k*10;
			
			n = n/10;
			
			arr[i] = temp;
			i++;
			
		} while(n!=0);
		
		
		int sum =0;
		
		for(int m=0; m<arr.length;m++)
		{
			sum = sum + arr[m];
		}
		
		System.out.println("---");
		System.out.println(sum);


	}

}
