package telran.string.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void testCharAt() {
		String checkString = "Bamby";
		assertTrue(checkString.charAt(0) == 'B');
		assertTrue(checkString.charAt(checkString.length() - 1) == 'y');
	}
	
	@Test 
	void testCompareTo() {
		String checkString1 = "Hello";
		String checkString2 = "Hello";
		String checkString3 = "Hell";
		assertTrue(checkString1.compareTo(checkString2) == 0);
		assertTrue(checkString1.compareTo(checkString3) ==
			checkString1.length() - checkString3.length());
	}
	
	@Test
	void testCompareToIgnoreCase() {
		String str1 = "JOHN";
		String str2 = "john";
		assertTrue(str1.compareToIgnoreCase(str2) == 0);
		assertFalse(str1.compareToIgnoreCase(str2) > 0);
	}
	
	@Test
	void testConcat() {
		String str1 = "blue";
		String str2 = "ball";
		assertTrue(str1.concat(str2).compareTo("blueball") == 0);
	}
	
	@Test
	void testStartWith() {
		String checkStr = "elephant";
		assertTrue(checkStr.startsWith("elep"));
		assertFalse(checkStr.startsWith("n"));
	}
	
	@Test
	void testEndsWith() {
		String checkStr = "elephant";
		assertTrue(checkStr.endsWith("ant"));
		assertFalse(checkStr.endsWith("anT"));
	}
	
	@Test
	void testContains() {
		String checkStr = "morning";
		assertTrue(checkStr.contains("orn"));
		assertFalse(checkStr.contains("ern"));
	}
	
	@Test
	void testIndexOf() {
		String checkStr = "earth air fire";
		assertEquals(6, checkStr.indexOf("air"));
		assertTrue(checkStr.indexOf("water") == -1);
	}
	
	@Test
	void testLastIndexOf() {
		String checkStr = "telescope";
		assertEquals(checkStr.length() - 1, checkStr.lastIndexOf(101));
		assertTrue(checkStr.lastIndexOf('e') == checkStr.length() - 1);		
	}

}
