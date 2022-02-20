
public class VSRB {
	
	String Name;
	String Categorie;
	int Marks;
	
	VSRB(String N, String C, int M)
	{
		Name = N;
		Categorie = C;
		Marks = M;
	}
	
	public static void main(String[] args) {
		
		VSRB p1 = new VSRB("Kishore","Proficient",92);
		
		VSRB p2 = new VSRB("Supratim","Moderate",75);
		
		
		VSRB p3 = new VSRB("Premjeet","Moderate+",81);
		
		VSRB p4 = new VSRB("Spandhan","Moderate",76);
		
		VSRB p5 = new VSRB("Shreyansh","Proficient+",98);
		
		p1.GetData();
		p2.GetData();
		p3.GetData();p4.GetData();p5.GetData();
		
		
		
		System.out.println();
		
		Name();
		
		System.out.println();
		
	
		
		
		System.out.println("If someone wants to be good in programming then keep practicing as "
         + "Much as you can, as many hours as you can ");
		
		
		System.out.println("Minimum 2 hours of quality programming everyday");
		
		System.out.println();
		
		Pattern(10);
		
	}
	
	public void GetData()
	{
		System.out.println("Mr."+ Name + "  " + Categorie + " Level Programmer"+ "  "
	       + "Having rating of " + Marks);
	}
	

	public static void Name()
	{
		
	 System.out.println("We can access anything in main directly from anymethod using static Keyword");
	}
	
	public static void Pattern(int n) {
		
		int i,j;
		for(i = 1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
