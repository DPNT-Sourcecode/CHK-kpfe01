package befaster.solutions.CHK;

public class Basket
{
	private int aCount;

	private int bCount;

	private int cCount;

	private int dCount;

	private int eCount;

	private int fCount;

	private int totalPrice = 0;

	public Basket(int aCount, int bCount, int cCount, int dCount, int eCount, int fCount)
	{

		this.aCount = aCount;
		this.bCount = bCount;
		this.cCount = cCount;
		this.dCount = dCount;
		this.eCount = eCount;
		this.fCount = fCount;
	}

	public int total()
	{
		oneFreeBForTwoEs();
		fiveAsCosts200();
		threeAsCosts130();
		twoBsCosts45();

		totalPrice += aCount * 50;
		totalPrice += bCount * 30;
		totalPrice += cCount * 20;
		totalPrice += dCount * 15;
		totalPrice += eCount * 40;
		totalPrice += fCount * 10;

		return totalPrice;
	}

	private void oneFreeBForTwoEs()
	{
		bCount -= (eCount / 2);
		bCount = Math.max(0, bCount);
	}

	private void fiveAsCosts200()
	{
		totalPrice += (aCount / 5) * 200;
		aCount = aCount % 5;
	}

	private void threeAsCosts130()
	{
		totalPrice += (aCount / 3) * 130;
		aCount = aCount % 3;
	}

	private void twoBsCosts45()
	{
		totalPrice += (bCount / 2) * 45;
		bCount = bCount % 2;
	}
}
