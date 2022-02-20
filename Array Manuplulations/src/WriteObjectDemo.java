import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectDemo {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee(1, "Shreyansh", 75000 , 1446747646664l);
		
		FileOutputStream fis = new FileOutputStream("Emp.txt");
		
		ObjectOutputStream oops = new ObjectOutputStream(fis);
		
		oops.writeObject(e);
		oops.close();
		fis.close();
		
		System.out.println("Write process complete ");			
		
	}

}
