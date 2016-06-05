
public class BankRates {

	public static void main(String[] args) {
		
		SBIBank s=new SBIBank();  
		ICICIBank i=new ICICIBank();  
		AXISBank a=new AXISBank();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());	

	}

}
