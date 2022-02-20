
public class Count {

	public static void main(String[] args) {

		int i,j;
		int visited = -1;

		int[] arr = new int[] {2,5,2,5,2,4,5,5};

		int[] freq = new int[arr.length];


		for(i=0;i<arr.length;i++)
		{
			int count = 1;

			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])

				{
					count++;	
					freq[j] = visited;

				}

			}


			if(freq[i] != visited)
			{
				freq[i] = count;
			}

		}

		for(i=0;i<arr.length;i++)
		{
			if(freq[i] != visited)
			{
				System.out.println(arr[i]+ " - number of times equals to " + freq[i]);
			}

		}

	}

}
