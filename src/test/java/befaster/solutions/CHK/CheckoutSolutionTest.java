package befaster.solutions.CHK;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutSolutionTest
{
	private CheckoutSolution solution = new CheckoutSolution();

	@Test
	public void aCosts50()
	{
		assertEquals(50, solution.checkout("A").intValue());
	}

	@Test
	public void twoAsCosts100()
	{
		assertEquals(100, solution.checkout("2A").intValue());
	}

	@Test
	public void threeAsCosts130()
	{
		assertEquals(130, solution.checkout("3A").intValue());
	}

	@Test
	public void bCosts30()
	{
		assertEquals(30, solution.checkout("B").intValue());
	}

	@Test
	public void twoBsCosts45()
	{
		assertEquals(45, solution.checkout("2B").intValue());
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
