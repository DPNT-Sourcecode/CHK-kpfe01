package befaster.solutions.CHK.price;

import java.util.Map;

public class PPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int pCount = itemCounts.get('P');

		price += (pCount / 5) * 200;
		pCount = pCount % 5;

		price += pCount * 50;

		return price;
	}
}
