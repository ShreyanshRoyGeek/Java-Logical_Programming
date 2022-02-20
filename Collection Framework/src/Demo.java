import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al = new ArrayList<>(); 
		ArrayList <String> al2 = new ArrayList<>();
		
		al.add(5);
		al.add(6);
		al.add(10);
		
		al.add(0,4);
		
		al2.add("Shreyansh");
		al2.add("Shivesh");
		
		al.addAll(al2);
		
		//al.forEach(null);
		
		
		
		for(Object val: al)
		{
			System.out.print(val + " ");
		}
		System.out.println();
		
		System.out.print(al);
		al.retainAll(al2);
		System.out.println();
		System.out.print(al);
		
		

	}

}
