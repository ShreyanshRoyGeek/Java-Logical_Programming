import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the four subject marks ");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		
		int avg = (a+ b + c+ d)/4;
		
		String res = (a< 35 || b<35 || c<35 || d<35 ) ? "fail" : (avg > 85 ? "distinction" : 
			avg > 60 ? "1st" : avg > 50 ? "2nd" : avg > 40 ? "3rd": "pass" ); 
		
		//int avg = (a+ b + c+ d)/4;
		
		
		
		
//		String res = (a>35 || a<40 && b>35 || b<40 && c>35 || c<40 && d>35 || d<40) ? "pass" : "fail"; 
//		
//		res = (a>40 && a<50|| b>40 && b<50 || c>40 && c<50 || d>40 && d<50) ? "3rd" : "pass";
//		
//		res = (a>50 && a<60|| b>50 && b<60 || c>50 && c<60 || d>50 && d<60) ? "2nd" : "3rd";
//		
//		res = (a>60 && a<85|| b>60 && b<85 || c>60 && c<85 || d>60 && d<85) ? "1st" : "2nd";
//		
//		res = (a>85 && a>60 || b>85 && b> 60 || c>85 && c>60 || d>85 && d>60) ? "distinction" : "1st";
		
		
		//res = (avg > 85 ? "distinction" : avg > 60 ? "1st" : avg > 50 ? "2nd" : avg > 40 ? "3rd": "pass" );
		
		System.out.println(res);
		
	
		
	}

}
