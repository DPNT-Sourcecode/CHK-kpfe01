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

		totalPrice += itemCounts.get('C') * 20;
		totalPrice += itemCounts.get('D') * 15;
		totalPrice += itemCounts.get('E') * 40;
		totalPrice += itemCounts.get('F') * 10;

		return totalPrice;
	}

	private void oneFreeBForTwoEs()
	{
		int newBCount = Math.max(0, itemCounts.get('B') - (itemCounts.get('E') / 2));

		itemCounts.put('B', newBCount);
	}

	private void threeFsForPriceOfTwo()
	{
		int oldFCount = itemCounts.get('F');

		itemCounts.put('F', oldFCount - (oldFCount / 3));
	}
}
