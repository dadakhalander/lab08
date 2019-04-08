package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddNumbers {
	@Test
	public void test() {
		jUnitTestingFunctions testing = new jUnitTestingFunctions();
		int result = testing.addNumbers(100, 200);
		assertEquals (300,result);
	}

}
