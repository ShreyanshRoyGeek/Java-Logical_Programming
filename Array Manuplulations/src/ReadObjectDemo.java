import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("Emp.txt"); // FNFE
		
		ObjectInputStream ois = new ObjectInputStream(fis); // IO Exception
		
		Object obj = ois.readObject(); // CNFE
		
		Employee emp = (Employee) obj;
		
		System.out.println(emp.id + " " + emp.name + " " + emp.salary + " " + emp.addharno );
		
		ois.close();
		fis.close();
		
	}

}
