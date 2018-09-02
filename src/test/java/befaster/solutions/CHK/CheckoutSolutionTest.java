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
	public void twoAsCost100()
	{
		assertEquals(100, solution.checkout("AA").intValue());
	}

	@Test
	public void threeAsCost130()
	{
		assertEquals(130, solution.checkout("AAA").intValue());
	}

	@Test
	public void fourAsCost180()
	{
		assertEquals(180, solution.checkout("AAAA").intValue());
	}

	@Test
	public void fiveAsCost200()
	{
		assertEquals(200, solution.checkout("AAAAA").intValue());
	}

	@Test
	public void bCosts30()
	{
		assertEquals(30, solution.checkout("B").intValue());
	}

	@Test
	public void twoBsCost45()
	{
		assertEquals(45, solution.checkout("BB").intValue());
	}

	@Test
	public void threeBsCost75()
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
	public void eCosts40()
	{
		assertEquals(40, solution.checkout("E").intValue());
	}

	@Test
	public void twoEsandOneBCosts80()
	{
		assertEquals(80, solution.checkout("EEB").intValue());
	}

	@Test
	public void fCosts10()
	{
		assertEquals(10, solution.checkout("F").intValue());
	}

	@Test
	public void twoFsCost20()
	{
		assertEquals(20, solution.checkout("FF").intValue());
	}

	@Test
	public void threeFCost20()
	{
		assertEquals(20, solution.checkout("FFF").intValue());
	}

	@Test
	public void abcdCosts115()
	{
		assertEquals(115, solution.checkout("ABCD").intValue());
	}

	@Test
	public void gCosts20()
	{
		assertEquals(20, solution.checkout("G").intValue());
	}

	@Test
	public void hCosts10()
	{
		assertEquals(10, solution.checkout("H").intValue());
	}

	@Test
	public void fiveHsCost45()
	{
		assertEquals(45, solution.checkout("HHHHH").intValue());
	}

	@Test
	public void tenHsCost80()
	{
		assertEquals(80, solution.checkout("HHHHHHHHHH").intValue());
	}

	@Test
	public void iCosts35()
	{
		assertEquals(35, solution.checkout("I").intValue());
	}

	@Test
	public void jCosts60()
	{
		assertEquals(60, solution.checkout("J").intValue());
	}

	@Test
	public void kCosts80()
	{
		assertEquals(80, solution.checkout("K").intValue());
	}

	@Test
	public void twoKsCost150()
	{
		assertEquals(150, solution.checkout("KK").intValue());
	}

	@Test
	public void LCosts90()
	{
		assertEquals(90, solution.checkout("L").intValue());
	}

	@Test
	public void MCosts15()
	{
		assertEquals(15, solution.checkout("M").intValue());
	}
}
