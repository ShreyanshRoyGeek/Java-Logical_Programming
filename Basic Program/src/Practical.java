
public class Practical {
	
	String Name;
	String Ambition;
	int LevelofDedication;	
	
	Practical(String N, String A, int L)
	{
		
		Name = N;
		Ambition = A;
		LevelofDedication = L;
		
	}
	
	public static void main(String[] args) {
		
		Practical p = new Practical("Shreyansh","Researcher",75);
		
		Practical q = new Practical("Shivesh","Researcher",92);
		
		q.Print();
		p.Print();
		
	}
	
	int Print()
	{
		System.out.println("Name -"+ Name + " "+ "Ambition -" + Ambition 
				+ " "+"LevelofDedication -" +LevelofDedication);
		
      		return LevelofDedication;
	}

}


