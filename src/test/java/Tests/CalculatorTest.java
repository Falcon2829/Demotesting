package Tests;
import static org.junit.Assert.*;

import org.junit.Test;

import app.calculator;

public class CalculatorTest {

	@Test
	public void test() {
		int exp=30;
		calculator cal =new calculator();
		int  act = cal.add(10, 20);
		assertEquals(exp,act);
	}

}
