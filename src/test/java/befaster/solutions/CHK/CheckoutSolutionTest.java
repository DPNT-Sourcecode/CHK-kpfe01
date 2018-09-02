package befaster.solutions.CHK;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutSolutionTest
{
	private CheckoutSolution solution = new CheckoutSolution();

	@Test
	public void smallAReturnsMinus1()
	{
		assertEquals(-1, solution.checkout("a").intValue());
	}

	@Test
	public void dashReturnsMinus1()
	{
		assertEquals(-1, solution.checkout("-").intValue());
	}

	@Test
	public void blankCosts0()
	{
		assertEquals(0, solution.checkout("").intValue());
	}

	@Test
	public void aCosts50()
	{
		assertEquals(50, solution.checkout("A").intValue());
	}

	@Test
	public void twoAsCosts100()
	{
		assertEquals(100, solution.checkout("AA").intValue());
	}

	@Test
	public void threeAsCosts130()
	{
		assertEquals(130, solution.checkout("AAA").intValue());
	}

	@Test
	public void fourAsCosts180()
	{
		assertEquals(180, solution.checkout("AAAA").intValue());
	}

	@Test
	public void bCosts30()
	{
		assertEquals(30, solution.checkout("B").intValue());
	}

	@Test
	public void twoBsCosts45()
	{
		assertEquals(45, solution.checkout("BB").intValue());
	}

	@Test
	public void threeBsCosts()
	{
		assertEquals(75, solution.checkout("BBB").intValue());
	}

	@Test
	public void cCosts20()
	{
		assertEquals(20, solution.checkout("C").intValue());
	}

	@Test
	public void dCosts15()
	{
		assertEquals(15, solution.checkout("D").intValue());
	}

	@Test
	public void abcdCosts115()
	{
		assertEquals(115, solution.checkout("ABCD").intValue());
	}
}
