package befaster.solutions.CHK;

import java.util.Map;

public class BPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;

		price += (itemCounts.get('B') / 2) * 45;
		itemCounts.put('B', itemCounts.get('B') % 2);

		price += itemCounts.get('A') * 30;

		return price;
	}
}
