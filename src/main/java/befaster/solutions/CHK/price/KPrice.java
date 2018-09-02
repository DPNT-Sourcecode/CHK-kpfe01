package befaster.solutions.CHK.price;

import java.util.Map;

public class KPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int bCount = itemCounts.get('K');

		price += (bCount / 2) * 150;
		bCount = bCount % 2;

		price += bCount * 80;

		return price;
	}
}
