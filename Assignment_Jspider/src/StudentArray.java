
public class StudentArray {
	
	String colour;
	
	int price;
	
	StudentArray(int price, String colour)
	{
		this.colour = colour;
		
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		StudentArray[] stu = new StudentArray[5]; 
		
		//stu = new StudentArray[5];
		
		
		int i =0;
		
		for(i=0;i<stu.length;i++)
		{
			stu[i] = new StudentArray(20, "Black");
		}
		
	
//		stu[0] = new StudentArray();
//		
//		stu[1] = new StudentArray();
		
		
		for(i=0;i<stu.length;i++)
		{
			System.out.println(stu[i]); 
		}
		
		System.out.println();
		
		
		for(i=0;i<stu.length;i++)
		{
			System.out.println(stu[i].colour + stu[i].price);
		}
		
		
		Object[] obj = new Object[5];
		
		obj[0] = new StudentArray(30, "Black");
		
		System.out.println(obj[0]);
		
	}
	

}
