
public class Fibonacci {
	
	static void uptoNthFibonacci(int count)
	{
		int n1 = 0, n2 = 1;
		
		System.out.print(n1+ " " + n2 + " ");
		
		for(int i=2; i<count; i++)
		{
			int n3 = n1+n2;
			System.out.print(n3 + " ");
			
			n1 = n2;
			n2 = n3;	
		}
		
		System.out.println();
	}
	
	
	static void toCountFibonacciWithinN(int count)
	{
		int n1 = 0, n2 =1;
		
		int n3= n1 +n2; 
		
		int temp = 2;
		
		while(n3<=count)
		{
			
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
			temp ++;
					
		}
		
		
		System.out.println(temp);
		
	}
	
	
	static void toCheckNumberNIsFibonacciOrNot(int count)
	{
        int n1 = 0, n2 =1;
		
		int n3 =0, temp =0; 
		
		while(n3<=count)
		{
			
			
			temp = n3;
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
			
			
					
		}
		
		
		if(count == temp)
		
			System.out.println("Number is Fibonacci ");
		
		
		else
			System.out.println("Number is not Fibonacci ");
		
		
	}
	
	static void forNthFibonacci(int count)
	{
		
		long n1 =0, n2 =1;
		long n3 =0;
		
		long mod = 1000000007;
		
		if(count == 0)
		{
			System.out.println(0);
		}
		
		else if(count == 1)
		{
			System.out.println(1);
		}
		
		
		else
		{	
			
			for(long i =2; i<=count;i++)
			{
				
				n3 = (n1 + n2)%mod;
				
				n1 = n2;
				n2 = n3;
			}
			
			
			System.out.println(n3);
		
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uptoNthFibonacci(5);
		
		//toCountFibonacciWithinN(400);
		
		forNthFibonacci(656);
		
		//toCheckNumberNIsFibonacciOrNot(13);
		

	}

}
