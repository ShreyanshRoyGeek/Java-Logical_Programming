import java.util.Scanner;

public class MultipleObject {

	public static void main(String[] args) {


		Static Card SelectObject()
		{

			System.out.println("Enter a value either 0 or 1");

			Scanner sc = new Scanner(System.in);

			int y = sc.nextInt(); sc.close();

			if(y == 0) 
			{
				Card c = new Card();
			
				return c;
			}

			else if(y == 1)
			{
				ForexCard f = new ForexCard();

				return f;

			}


		}

	}	
}
