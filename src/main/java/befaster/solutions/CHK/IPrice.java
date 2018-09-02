package befaster.solutions.CHK;

import java.util.Map;

public class IPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('I') * 35;
	}
}
