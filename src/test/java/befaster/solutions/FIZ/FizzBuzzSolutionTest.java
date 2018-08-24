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
	public void threeReturnsFizzDeluxe()
	{
		assertEquals("fizz", solution.fizzBuzz(3));
	}

	@Test
	public void fourReturnsFour()
	{
		assertEquals("4", solution.fizzBuzz(4));
	}

	@Test
	public void fiveReturnsBuzzDeluxe()
	{
		assertEquals("buzz fake deluxe", solution.fizzBuzz(5));
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
	public void elevenReturnsEleven()
	{
		assertEquals("11", solution.fizzBuzz(11));
	}

	@Test
	public void thirteenReturnsFizz()
	{
		assertEquals("fizz", solution.fizzBuzz(13));
	}

	@Test
	public void fifteenReturnsFizzBuzzFakeDeluxe()
	{
		assertEquals("fizz buzz fake deluxe", solution.fizzBuzz(15));
	}

	@Test
	public void twentyTwoReturnsTwentyTwo()
	{
		assertEquals("22", solution.fizzBuzz(22));
	}

	@Test
	public void thirtyReturnsFizzBuzz()
	{
		assertEquals("fizz buzz deluxe", solution.fizzBuzz(30));
	}

	@Test
	public void thirtyThreeReturnsFizzFakeDeluxe()
	{
		assertEquals("fizz fake deluxe", solution.fizzBuzz(33));
	}

	@Test
	public void fiftyOneReturnsFizzBuzz()
	{
		assertEquals("fizz buzz", solution.fizzBuzz(51));
	}

	@Test
	public void fiftyTwoReturnsBuzz()
	{
		assertEquals("buzz", solution.fizzBuzz(52));
	}

	@Test
	public void fiftyThreeReturnsFizzBuzz()
	{
		assertEquals("fizz buzz", solution.fizzBuzz(53));
	}

	@Test
	public void fiftyFiveReturnsBuzzFakeDeluxe()
	{
		assertEquals("buzz fake deluxe", solution.fizzBuzz(55));
	}
}
