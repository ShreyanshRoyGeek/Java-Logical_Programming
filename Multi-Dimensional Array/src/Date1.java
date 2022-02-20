import java.util.Scanner;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int x = n;
		
		String str = "";
		
		for(int i =0; i<4;i++)
		{
			int m1 = n%10;
			
			str+= m1;
			x= x/10;

		}
	
		
		
		int year = Integer.parseInt(str);
		
		System.out.println("No of days ");
		
		int days = year*365;
		
		int leap =0;
		
//		if(days%4 == 0 && days%100 !=0 || days%400 == 0)
//		{
			leap = days = days/4 - days/100 + days/400;
		//}
		
		
		
			int months = x%10;
			x = x/10;
		
		
		
		int monthDays = 0;
		
		//int month =1;
		switch(months)
		{
			case 1 :
				monthDays += 31;
				
			case 2 :
				monthDays += 31+28;
			
			case 3 :
				monthDays += 31+28+30;
			
			case 4:
				monthDays += 31+28+30+31;
			
			
				
				
			
		
		}
		
		int dayOnthatDate =  x;
		
		
		int sum = (days+ leap + months+ monthDays + dayOnthatDate)%7;
		
		
		
		
		
		
		
		
		

	}

}
