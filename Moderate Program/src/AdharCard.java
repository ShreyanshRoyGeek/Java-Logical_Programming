/*  ----   toString method of javalang package overriding ----  */

public class AdharCard {

	long adharNumber, contact;
	String  name, address;
	
	
	@Override
	public String toString()
	{
		String address = super.toString();
		
		AdharCard c = new AdharCard();
		
		
		//return address +"       " +c.name + " " + c.adharNumber + " " + c.contact + " " + c.address;
		
		return address +"       " +this.name + " " + this.adharNumber + " " + this.contact + " " + this.address;
		
		//String content =  address +"       " +this.name + " " + this.adharNumber + " " + this.contact + " " + this.address;
		//return content;
	}
	
	public static void main(String[] args) {
		
		AdharCard a = new AdharCard();
	
		
		a.name = "Shreyansh Roy";
		a.contact = 6291346211l;
		a.adharNumber = 45689554398769696l;
		a.address = "Bihar - Darbhanga";
	
		
		System.out.println(a);
			
		
	}
}
