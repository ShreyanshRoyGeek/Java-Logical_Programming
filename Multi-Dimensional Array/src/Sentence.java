import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		String[] string = {"","enty","hundred"};

		String str = "";
		
		String st = "";

		int i =0;
		
		do
		{
			int re = n%10;

			switch(re)
			{

			case 1 :
				str = " one";
				break;

			case 2 :
				str = " two";
				break;

			case 3 :
				str = " three";
				break;

			case 4 :
				str = " four";
				break;

			case 5 :
				str = " five";
				break;

			case 6 :
				str = " six";
				break;

			case 7:
				str = " seven";
				break;

			case 8:
				str = " eight";
				break;

			case 9:
				str  = " nine";
				break;

			case 0 :
				str = " zero";
				break;

			default:
				str = ""; 

			}
			
			str = str + string[i]; 
			//st = str + st;
			st = str +st;
			i++;

			n = n/10;

		}while(n!=0);
		
		
		System.out.println(st);
		

	}

}
