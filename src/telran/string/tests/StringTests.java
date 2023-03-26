package telran.string.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		assertEquals('B', "Bamby".charAt(0));
		assertEquals(66, "Bamby".charAt(0));
		assertEquals('y', "Bamby".charAt("Bamby".length() - 1));
	}
	
	
	@Test 
	void testCompareTo() {
		assertEquals(0, "Hello".compareTo("Hello"));
		assertTrue("Hello".compareTo("Hell") > 0);
		assertTrue("Hell".compareTo("Hello") < 0);
		assertEquals(8, "9".compareTo("12345"));
		assertEquals('h' - 'H', "hello".compareTo("Hello"));
	}
	
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, "John".compareToIgnoreCase("jOhN"));
		assertTrue("John".compareToIgnoreCase("Johny") != 0);
		assertEquals(0, "john".compareToIgnoreCase("john"));
	}
	
	@Test
	void testConcat() {
		assertEquals("football", "foot".concat("ball"));
		assertEquals("football", "".concat("football"));
		assertEquals("football", "football".concat(""));
		}
	
	@Test
	void testStartWith() {
		assertTrue("elephant".startsWith("el"));
		assertTrue("elephant".startsWith(""));
		assertFalse("elephant".startsWith("El"));
	}
	
	@Test
	void testEndsWith() {
		assertTrue("elephant".endsWith("ant"));
		assertFalse("elephant".endsWith("anT"));
		assertTrue("elephant".endsWith(""));
	}
	
	@Test
	void testContains() {
		assertTrue("morning".contains("morn"));
		assertTrue("morning".contains("ing"));
		assertTrue("morning".contains("orn"));
		assertFalse("morning".contains("ern"));
		assertFalse("morning".contains("Orn"));

	}
	
	@Test
	void testIndexOf() {
		assertEquals(6, "earth air fire".indexOf("air"));
		assertEquals(-1, "earth air fire".indexOf("water"));
		assertEquals(0, "earth air fire".indexOf(""));
	}
	
	@Test
	void testLastIndexOf() {
		assertEquals(4, "telescope".lastIndexOf("scope"));
		assertEquals(8, "telescope".lastIndexOf("e"));		
		assertEquals(8, "telescope".lastIndexOf('e'));	
		assertEquals(8, "telescope".lastIndexOf(101));	
		assertEquals(9, "telescope".lastIndexOf(""));	
		assertEquals(-1, "telescope".lastIndexOf("w"));
	}

}
