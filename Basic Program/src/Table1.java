
public class Table1 {
	
	int n;
	
	void count_table(int n)
	{
		this.n = n;

		int i;

		for(i=1;i<=10;i++)
		{ 
			int y = n*i;

			System.out.println(this.n + "*" + i + " " + y);

		}

		System.out.println("----------------");

	}
	
	
	public static void main(String[] args) {
		
		Table1 t = new Table1();
		
		t.count_table(17);
		
		t.count_table(18);
		
		t.count_table(19);
		
		
		
	}
}

	
	


