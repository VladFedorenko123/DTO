package src.srccode.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.srccode.dto.VowelsCalculator;

class VowelsCalculatorTest {
	VowelsCalculator objectUnderTest = new VowelsCalculator();

	@Test
	void testGetVowels() {
		assertEquals(1, objectUnderTest.getVowels("vlad"));
		assertEquals(2, objectUnderTest.getVowels("sasha"));
		assertEquals(2, objectUnderTest.getVowels("vlodmyr"));
	}

}
