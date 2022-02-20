
public class NumberisBalancedOrNot {

	static void toconvertCharacterIntoInteger1(String st)
	{
		int temp = Integer.parseInt(String.valueOf(st.charAt(0)));
		System.out.println(temp);
		
		
	}
	
	static void toconvertCharacterIntoInteger2(String st)
	{
		
		int sum1 =0 , sum2 =0;
		
		//int temp = Integer.parseInt(st.substring(0,1)); // fetch st[0]character.
		//System.out.println(temp);
		
		for(int i =0; i<st.length()/2;i++)
		{
			sum1 += Integer.parseInt(st.substring(i, i+1));
			sum2 += Integer.parseInt(st.substring(st.length()-i-1, st.length()-i));
		}
		
		if(sum1 == sum2)
		
			System.out.println("Number is balanced ");
		
		
		else
			System.out.println("Number is not balanced ");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "32341";

		//char ch[] = st.toCharArray();


		int sum1 =0; int sum2 =0;
		for(int i =0; i<st.length();i++)
		{
			if(i<st.length()/2)
				//sum1 += st.charAt(i);
				sum1 += Integer.parseInt(st.charAt(i) + "");

			else if(i>st.length()/2)
				//sum2 += st.charAt(i);

				sum2 += Integer.parseInt(st.charAt(i)+"");

		}

		System.out.println(sum1);

		System.out.println(sum2);


		//int res = (int)('3'+'2'); // Corresponding ASCII Value will be added
		//System.out.println(res);

		toconvertCharacterIntoInteger2(st);

//		if(sum1==sum2)
//			System.out.println("Number is balance ");
//		else
//			System.out.println("Number is not balance ");

	}

}
