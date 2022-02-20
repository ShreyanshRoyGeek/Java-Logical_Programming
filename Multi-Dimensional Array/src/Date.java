import java.util.Scanner;

public class Date {
	
	int dd,mm,yy;
	
	int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	String dname[] = {"sunday", "monday", "tuesday", "wednesday", "thursday","friday",
			"saturday"};
	
	public Date(int dd, int mm, int yy)
	{
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
		if(yy%4==0 && yy%100 !=0 || yy%400 == 0)
		{
			month[2] = 29;
		}
		
	}
	

	
	public int noOfDays()
	{
		
		int days = dd;
		int y = yy-1;
		
			days = days+y*365;
			days = days + y/4 - y/100 + y/400;
			
			for(int i =1; i<mm; i++)
			{
				days = days + month[i];
			}
			
		return days;	
	}
	
	
	public String dayName()
	{
		
		return dname[noOfDays()%7];
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return noOfDays();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + dayName()+ "]" + dd + "/" + mm + "/" + yy;
	}
	
	static Date readDate()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date(dd mm yyyy)");
		
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		Date dt = new Date(d,m,y);
		return dt;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first date: ");
		Date d1 = Date.readDate();
		
		System.out.println("Enter Second date: ");
		Date d2 = Date.readDate();
		
		System.out.println(d1);
		
		System.out.println(d2);
		
		System.out.println("No of days b/w " + d1+" and " + d2 + " is "
				+ (d2.noOfDays()- d1.noOfDays()));
		
	
	}

}
