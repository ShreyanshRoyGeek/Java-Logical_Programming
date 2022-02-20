import java.io.Serializable;

public class Employee implements Serializable {
	
	
	private static final long serialVersionUID = -7855374736274352507L;

	int id; String name; int salary;  long addharno; 
	
	Employee(int id, String name, int salary, long addharno)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addharno = addharno; //transient long addharno; // 
		//transient;
	}

	public void work()
	{
		System.out.println("Employee Works ");
	}
	

	

}
