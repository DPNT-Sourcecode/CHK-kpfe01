package befaster.solutions.CHK.price;

import java.util.Map;

public class CPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('C') * 20;
	}
}
