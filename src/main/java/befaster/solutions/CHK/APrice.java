package befaster.solutions.CHK;

import java.util.Map;

public class APrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;

		price += (itemCounts.get('A') / 5) * 200;
		itemCounts.put('A', itemCounts.get('A') % 5);

		price += (itemCounts.get('A') / 3) * 130;
		itemCounts.put('A', itemCounts.get('A') % 3);

		price += itemCounts.get('A') * 50;

		return price;
	}
}
