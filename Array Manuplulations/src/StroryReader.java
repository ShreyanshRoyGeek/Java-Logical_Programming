import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// DeSerilization or not..

/* Buffer + Character Stream */
public class StroryReader {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("story.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String story = " ";
		
		while((story = br.readLine()) != null)
		{
			System.out.println(story);
		}
		
		br.close();
		fr.close();
		
	}

}
