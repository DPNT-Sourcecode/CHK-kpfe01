package befaster.solutions.CHK;

import java.util.Map;

public class GPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('G') * 20;
	}
}
