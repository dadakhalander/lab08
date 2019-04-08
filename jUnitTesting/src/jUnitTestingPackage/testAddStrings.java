package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testAddStrings {
	@Test
	public void test() {
		jUnitTestingFunctions testing2 = new jUnitTestingFunctions();
		String result = testing2.addStrings("Hello ", "Vivek!!!!");
		assertEquals ("Hello Vivek!!!!",result);
	}
}
