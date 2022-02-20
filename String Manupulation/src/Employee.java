
public class Employee {

	int id; String name; double salary;



	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int hashCode()
	{
		return this.id;

	}


	public String toString() {
		// TODO Auto-generated method stub
		
		//String s =this.id+  " " +  this.name + " " + this.salary; 
		return this.id+  " " +  this.name + " " + this.salary;
	}

	public boolean equals(Object obj)
	{
		Employee  h = (Employee)obj;
		return this.salary == h.salary;

	}



	public static void main(String[] args) {

		// TODO Auto-generated constructor stub

		Employee e = new Employee(1, "Shreyansh",65000);

		System.out.println(e);


	}




}
