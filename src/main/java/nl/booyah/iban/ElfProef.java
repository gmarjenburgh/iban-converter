package nl.booyah.iban;

public class ElfProef {

	public static boolean elevenTest(String bankAccountNumber) {
	
		int length = bankAccountNumber.length();
		int sum = 0;
		long numericBankAccountNumber = Long.parseLong(bankAccountNumber);
		
		for (int i = 1; i < length + 1; i++) {
			sum += i * (numericBankAccountNumber % 10);
			numericBankAccountNumber /= 10;
		}
		return sum != 0 && (sum % 11) == 0;
	}

}
