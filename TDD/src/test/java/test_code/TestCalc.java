package test_code;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java_code.Calc;
import java_code.WeekEnd;

public class TestCalc {
	Calc obj;
	@Before
	public void setUp() throws Exception {
		 obj = new Calc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int ans =3+8*2-7;
		String test = "3+8*2-7";
		assertEquals(ans,obj.calc(test));
		

	}

}
