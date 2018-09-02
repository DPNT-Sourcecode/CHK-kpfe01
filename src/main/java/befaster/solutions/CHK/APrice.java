package befaster.solutions.CHK;

import java.util.Map;

public class APrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int aCount = itemCounts.get('A');

		price += (aCount / 5) * 200;
		aCount = aCount % 5;

		price += (aCount / 3) * 130;
		aCount = aCount % 3;

		price += aCount * 50;

		return price;
	}
}
