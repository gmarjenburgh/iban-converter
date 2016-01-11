package nl.booyah.iban;

public class IBAN {
	private String countryCode;
	private String checkDigits;
	private String bankCode;
	private String accountNumber; // Always 10 characters
	
	@Override
	public String toString(){
		return countryCode + checkDigits + bankCode + accountNumber; 
	}
	
	IBAN(String bankCode, String accountNumber){
		this.countryCode = "NL";
		this.checkDigits = checkDigits(bankCode,accountNumber);
		this.bankCode = bankCode;		
		this.accountNumber = "0000000000".substring(accountNumber.length()) + accountNumber;
	}
	
	void printIBAN(){
		System.out.println(countryCode+checkDigits+bankCode+accountNumber);
	}
}
