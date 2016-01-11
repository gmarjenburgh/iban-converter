package nl.booyah.iban;

import java.math.BigInteger;

public class IBAN {

    private String countryCode;
    private String checkDigits;
    private String bankCode;
    private String accountNumber; // Always 10 characters

	public IBAN(String bankCode, String accountNumber){
		this.countryCode = "NL";
		this.bankCode = bankCode;
        this.accountNumber = "0000000000".substring(accountNumber.length()) + accountNumber;
        this.checkDigits = calculateCheckDigits();
    }

    /**
     * The checkDigits are computed from the accountNumber and the bankCode by the following rules:
     * 1. Take the accountNumber and append the bankCode
     * 2. Replace all characters with two digits based on position in the alphabet (A = 10, B = 11, ...)
     * 3. Add 00 at the end
     * 4. Take the result modulo 97
     * 5. Subtract the previous value from 98
     * 6. Prepend a 0 if the result is smaller than 10
     *
     * @return the two-character checkDigits string that occurs in the IBAN string
     */
    private String calculateCheckDigits() {
        char[] input = (bankCode + accountNumber + countryCode).toCharArray();
        String output = "";

        for (char c : input) {
            output += Character.getNumericValue(c);
        }
        output += "00";
        BigInteger longString = new BigInteger(output);
        Integer result = 98 - longString.mod(new BigInteger("97")).intValue();;

        return result < 10 ? "0" + result : result.toString();
    }

    @Override
    public String toString(){
        return countryCode + checkDigits + bankCode + accountNumber;
    }

}
