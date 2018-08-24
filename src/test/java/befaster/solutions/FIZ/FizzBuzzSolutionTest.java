package befaster.solutions.FIZ;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class FizzBuzzSolutionTest
{
	private FizzBuzzSolution solution = new FizzBuzzSolution();

	@Test
	public void oneReturnsOne()
	{
		assertEquals("1", solution.fizzBuzz(1));
	}

	@Test
	public void twoReturnsTwo()
	{
		assertEquals("2", solution.fizzBuzz(2));
	}

	@Test
	public void threeReturnsFizz()
	{
		assertEquals("fizz", solution.fizzBuzz(3));
	}

	@Test
	public void fourReturnsFour()
	{
		assertEquals("4", solution.fizzBuzz(4));
	}

	@Test
	public void fiveReturnsBuzz()
	{
		assertEquals("buzz", solution.fizzBuzz(5));
	}

	@Test
	public void sixReturnsFizz()
	{
		assertEquals("fizz", solution.fizzBuzz(6));
	}

	@Test
	public void tenReturnsBuzz()
	{
		assertEquals("buzz", solution.fizzBuzz(10));
	}

	@Test
	public void fifteenReturnsFizzBuzz()
	{
		assertEquals("fizz buzz", solution.fizzBuzz(15));
	}
}
