package nl.booyah.iban;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IBANTest {

    @Test
    public void testIBANContructor() {
        IBAN iban = new IBAN("INGB", "1234567");
        assertThat(iban.toString(), is("NL20INGB0001234567"));

        iban = new IBAN("INGB", "9675181");
        assertThat(iban.toString(), is("NL92INGB0009675181"));
    }
}
