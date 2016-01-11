package nl.booyah.iban;

import org.junit.Test;
import org.junit.*;

public class ElfProefTest {

	@Test
	public void elfProefTestTrue(){
		Assert.assertTrue(ElfProef.elevenTest("472553690"));
		Assert.assertTrue(ElfProef.elevenTest("00000612"));
		Assert.assertTrue(ElfProef.elevenTest("00008001"));
	}
	
	@Test
	public void elfProefTestFalse() {
		Assert.assertFalse(ElfProef.elevenTest("0"));
	}
	
}
