package befaster.solutions.CHK.price;

import java.util.Map;

public class SPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('S') * 30;
	}
}
