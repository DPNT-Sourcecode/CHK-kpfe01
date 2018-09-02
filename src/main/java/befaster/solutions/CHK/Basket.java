package befaster.solutions.CHK;

import java.util.Map;

public class Basket
{
	private Map<Character, Integer> itemCounts;

	private int totalPrice;

	public Basket(Map<Character, Integer> itemCounts, int totalPrice)
	{
		this.itemCounts = itemCounts;
		this.totalPrice = totalPrice;
	}

	public int total()
	{
		oneFreeBForTwoEs();
		twoBsCosts45();
		threeFsForPriceOfTwo();

		this.totalPrice += itemCounts.get('B') * 30;
		this.totalPrice += itemCounts.get('C') * 20;
		this.totalPrice += itemCounts.get('D') * 15;
		this.totalPrice += itemCounts.get('E') * 40;
		this.totalPrice += itemCounts.get('F') * 10;

		return this.totalPrice;
	}

	private void oneFreeBForTwoEs()
	{
		int newBCount = Math.max(0, itemCounts.get('B') - (itemCounts.get('E') / 2));

		itemCounts.put('B', newBCount);
	}

	private void twoBsCosts45()
	{
		totalPrice += (itemCounts.get('B') / 2) * 45;
		itemCounts.put('B', itemCounts.get('B') % 2);
	}

	private void threeFsForPriceOfTwo()
	{
		int oldFCount = itemCounts.get('F');

		itemCounts.put('F', oldFCount - (oldFCount / 3));
	}
}
