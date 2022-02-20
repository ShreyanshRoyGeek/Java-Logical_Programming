package BitMagic;

// To calculate the xor between the given number
// 1^2^3^4^5^6^7^....^n = ?

public class New {
	
	static int toFindXorI(int n)  //O(n) solution
	{
		
		int xor = 0;
		for(int i=1; i<=n;i++)
		{
			xor = xor ^ i;
		}
		
		return xor;
		
	}
	
	static void toFindXorII(int y) //O(1) solution
	{
		if(y%4 == 0)
		{
			System.out.println(y); 
		}
		
		if(y%4 == 1)
		{
			System.out.println(1);
		}
		
		if(y%4 == 2)
		{
			System.out.println(y+1);
		}
		
		if(y%4 == 3)
		{
			System.out.println(0);
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 5;
		
		int res = toFindXorI(n);
		
		System.out.println(res);
		
		toFindXorII(n);

	}

}
