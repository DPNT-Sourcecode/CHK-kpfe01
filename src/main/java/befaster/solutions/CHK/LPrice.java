package befaster.solutions.CHK;

import java.util.Map;

public class LPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('L') * 90;
	}
}
