package befaster.solutions.CHK;

import java.util.Map;

public class Basket
{
	private Map<Character, Integer> itemCounts;

	private int totalPrice = 0;

	public Basket(Map<Character, Integer> itemCounts)
	{
		this.itemCounts = itemCounts;
	}

	public int total()
	{
		oneFreeBForTwoEs();
		fiveAsCosts200();
		threeAsCosts130();
		twoBsCosts45();
		threeFsForPriceOfTwo();

		totalPrice += itemCounts.get('A') * 50;
		totalPrice += itemCounts.get('B') * 30;
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

	private void fiveAsCosts200()
	{
		totalPrice += (itemCounts.get('A') / 5) * 200;
		itemCounts.put('A', itemCounts.get('A') % 5);
	}

	private void threeAsCosts130()
	{
		totalPrice += (itemCounts.get('A') / 3) * 130;
		itemCounts.put('A', itemCounts.get('A') % 3);
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
