package test_code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java_code.WeekEnd;

public class WeekEndTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsWeekEnd() {
		assertEquals(false,WeekEnd.isWeekEnd());
	}

}
