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
}
