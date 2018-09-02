package befaster.solutions.CHK;

import java.util.Map;

public class MPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('M') * 15;
	}
}
