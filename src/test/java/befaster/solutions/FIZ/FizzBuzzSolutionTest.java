package befaster.solutions.FIZ;

import org.junit.Test;

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
}
