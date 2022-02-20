
public class Employee {

	String Name;
	int Salary;
	String Company;
	long Number;
	String Job;

	Employee(String Name,int Salary,String Company,long Number,String Job )
	{
		this.Name = N;
		this.Salary =S;
		this.Company=C;
		this.Number = N;
		this.Job = J;
	}


	public static void main(String[] args) 
	{

		Employee e1 = new Employee("raju",2300,"wipro",132,"je");
		//		Employee e2 = new Employee();
		//		Employee e3 = new Employee();
		//		Employee e4 = new Employee();
		//		Employee e5 = new Employee();
		//		
		//		Mobile m1 = new Mobile();
		//		
		System.out.println(e1.Name+ " " + e1.Company+ " " + e1.Salary+ " " + e1.Job+ " " + e1.Number);

		//		System.out.println("Mobile Shreynah have " + m1.Name + " " + m1.Price);
		//		
	}

}
