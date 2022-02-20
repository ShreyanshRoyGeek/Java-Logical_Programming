import sun.jvm.hotspot.runtime.StaticBaseConstructor;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[][] {{3,5,6}, {2,4,6}, {8,9,7}};
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		
		System.out.println(arr[1].length);
		
		System.out.println(arr[arr.length-1].length);
		
		System.out.println(arr);
		
		System.out.println(arr[0]);
		
		
		for(int i =0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
		}
		

	}

}
