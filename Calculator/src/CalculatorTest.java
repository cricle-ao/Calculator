import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	Calculator c=new Calculator();
	@Test
	public void testAdd() {
		c.add(1);
	}
	@Test
	public void testSubstract() {
		c.substract(1);
	}
	@Test
	public void testMultiply() {
	   c.multiply(1);
	}
	@Test
	public void testDivide() {
		c.divide(2);
	}
	@Test
	public void testSquare() {
	    c.square(2);
	}
	@Test
	public void testSquareRoot() {
		c.squareRoot(2);
	}
	@Test
	public void testClear() {
		c.clear();
	}
	@Test
	public void testGetResult() {
		c.getResult();
	}

}
