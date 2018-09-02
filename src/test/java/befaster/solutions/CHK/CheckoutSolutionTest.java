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
	public void bCosts30()
	{
		assertEquals(30, solution.checkout("B").intValue());
	}
}
