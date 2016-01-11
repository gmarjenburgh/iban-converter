package nl.booyah.iban;

import org.junit.Test;

import static nl.booyah.iban.Banks.BANKCODE.ABNA;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BanksTest {

    @Test
    public void shouldContainABNAmro() {
        assertThat(ABNA.getName(), is("ABN AMRO BANK NV"));
    }
}
