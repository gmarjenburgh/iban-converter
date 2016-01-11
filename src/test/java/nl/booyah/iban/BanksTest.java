package nl.booyah.iban;

import org.junit.Test;

import static nl.booyah.iban.Banks.BANKCODE.ABNA;
import static nl.booyah.iban.Banks.BANK_NAME_MAP;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BanksTest {

    @Test
    public void shouldContainABNAmro() {
        assertThat(ABNA.getName(), is("ABN AMRO BANK NV"));
    }

    @Test
    public void bankNamesMapShouldBeOrdered() {
        assertThat(BANK_NAME_MAP.firstKey(), is("(SVENSKA) HANDELSBANKEN AB"));
        assertThat(BANK_NAME_MAP.lastKey(), is("ZWITSERLEVENBANK"));
    }
}
