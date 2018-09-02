package befaster.solutions.CHK.price;

import java.util.Map;

public class TPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('T') * 20;
	}
}
