package befaster.solutions.CHK;

import java.util.Map;

public class BPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int bCount = itemCounts.get('B');

		price += (bCount / 2) * 45;
		bCount = bCount % 2;

		price += bCount * 30;

		return price;
	}
}
