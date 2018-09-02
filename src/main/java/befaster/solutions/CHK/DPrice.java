package befaster.solutions.CHK;

import java.util.Map;

public class DPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('D') * 15;
	}
}
