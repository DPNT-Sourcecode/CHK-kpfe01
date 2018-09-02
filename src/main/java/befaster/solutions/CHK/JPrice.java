package befaster.solutions.CHK;

import java.util.Map;

public class JPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('J') * 60;
	}
}
