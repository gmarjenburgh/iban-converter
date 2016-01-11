package nl.booyah.iban;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public static boolean elevenTest(long aNumber){
		
		int lengte = String.valueOf(aNumber).length();
		int totaal=0;
		boolean result = String.valueOf(aNumber).length()<=11;
				
		for (int i=1;i<lengte+1;i++){
			totaal += i * (aNumber % 10);
			aNumber /=10;
		}
		
		result = (totaal % 11)==0;
				
		return result;
	}


}
