package befaster.solutions.CHK;

public class Basket
{
	private int aCount;

	private int bCount;

	private int cCount;

	private int dCount;

	private int eCount;

	private int totalPrice = 0;

	public Basket(int aCount, int bCount, int cCount, int dCount, int eCount)
	{

		this.aCount = aCount;
		this.bCount = bCount;
		this.cCount = cCount;
		this.dCount = dCount;
		this.eCount = eCount;
	}

	public int total()
	{
		totalPrice += (aCount / 3) * 130;
		totalPrice += (aCount % 3) * 50;

		totalPrice += (bCount / 2) * 45;
		totalPrice += (bCount % 2) * 30;

		totalPrice += cCount * 20;
		totalPrice += dCount * 15;
		totalPrice += eCount * 40;

		return totalPrice;
	}
}
