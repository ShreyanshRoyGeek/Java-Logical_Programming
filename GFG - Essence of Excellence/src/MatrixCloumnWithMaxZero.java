import java.util.Scanner;

public class MatrixCloumnWithMaxZero {
	
	static int toFindColumnWithMaxZeros(int arr[][])
    {
        // code here 
        int count[] = new int[arr.length];
        
        int count1 = 0; 
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[j][i]==0)
                {
                    count1++;
                }
                
            }
            
            count[i] = count1;
        }
        
        

        int big = count[0];
        
        for(int i=1; i<count.length;i++)
        {
            if(count[i]>big)
            {
                big = i;
            }
        }
        
        return big;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of  matrix");

		System.out.println("Enter the row size");
		int m = sc.nextInt();

		System.out.println("Enter the column size");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		System.out.println("Enter the "+ m + " rows and "+  n + " columns " + " of 1st matrix ");
		for(int i =0; i<m; i++)
		{
			for(int j =0 ; j<n ; j++)
			{

				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int res = toFindColumnWithMaxZeros(arr);
		
		System.out.println(res);

	}

}
