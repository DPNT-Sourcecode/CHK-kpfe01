package befaster.solutions.CHK;

import java.util.Map;

public class HPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int hCount = itemCounts.get('H');

		price += (hCount / 10) * 80;
		hCount = hCount % 10;

		price += (hCount / 5) * 45;
		hCount = hCount % 5;

		price += hCount * 10;

		return price;
	}
}
