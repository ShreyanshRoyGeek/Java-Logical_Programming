import java.util.Scanner;


// Without using loop -- using recusrsion

public class PrintValueNto1 {
	
	
	static void display(int x)
	{
		System.out.println(x);
		
		if(x>1)
		{
			display(x-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int x = sc.nextInt();
		
		display(x);
		

	}

}
