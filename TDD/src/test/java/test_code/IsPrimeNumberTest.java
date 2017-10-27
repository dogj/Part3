package test_code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java_code.IsPrimeNumber;

public class IsPrimeNumberTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPrimeNumber() {
		assertEquals(false,IsPrimeNumber.isPrimeNumber(33));

	}

}
