package befaster.solutions.CHK.price;

import java.util.Map;

public class PPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int bCount = itemCounts.get('P');

		price += (bCount / 5) * 200;
		bCount = bCount % 5;

		price += bCount * 50;

		return price;
	}
}
