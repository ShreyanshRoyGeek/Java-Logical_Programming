
public class Student {
	
	String Name;
	int Marks;
	int Roll;
	int IdNo;
	String Gender;
	
	Student(String N, int M, int R, int I, String G)
	{
		Name = N;
		Marks = M;
		Roll = R;
		IdNo = I;
		Gender = G;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Shreyansh",81,31,331,"M");
		Student s2 = new Student("Shreya",71,31,335,"F");
		Student s3 = new Student("Suyash",69,31,341,"M");
		Student s4 = new Student("Shreynshu",72,31,321,"M");
		Student s5 = new Student("Sohan",61,31,371,"M");
		
		System.out.println(s1.Name +" " +s1.Marks+ " " + s1.Roll+" " + s1.IdNo+" "+ s1.Gender);
		
	}

}
