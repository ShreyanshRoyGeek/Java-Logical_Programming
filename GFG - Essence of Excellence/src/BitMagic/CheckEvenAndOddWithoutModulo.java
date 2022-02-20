package BitMagic;

import java.util.Scanner;

public class CheckEvenAndOddWithoutModulo {
	
	// 3 = 011, 5 = 101 --> All odd number ends with 1 and so (Corresponding bit & 1) == 1 means odd. 
	// i.e.,3 odd-->   1 0 1           4 Even -->  1 0 0 <-- last bit 0 for even number
	//                &    1                      &    1
	//                --------                  ----------
	//                 0 0 1 --> 1                 0 0 0   --> 0

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n&1)==1)
			System.out.println("Odd");
	
		else
			System.out.println("Even");
	}

}
