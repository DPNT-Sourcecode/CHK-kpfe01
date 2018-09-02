package befaster.solutions.CHK;

import java.util.Map;

public class Basket
{
	private Map<Character, Integer> itemCounts;

	public Basket(Map<Character, Integer> itemCounts)
	{
		this.itemCounts = itemCounts;
	}

	public int total()
	{
		int totalPrice = 0;

		oneFreeBForTwoEs();
		threeFsForPriceOfTwo();

		totalPrice += itemCounts.get('F') * 10;

		return totalPrice;
	}

	private void oneFreeBForTwoEs()
	{
	}

	private void threeFsForPriceOfTwo()
	{
		int oldFCount = itemCounts.get('F');

		itemCounts.put('F', oldFCount - (oldFCount / 3));
	}
}
