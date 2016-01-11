package nl.booyah.iban;

public class Main {

	public static void main(String[] args) {
		String bankCode = args[0];
		String accountNumber = args[1];
		IBAN iban = new IBAN(bankCode, accountNumber);
		System.out.println(iban);
		System.exit(0);
	}
}
