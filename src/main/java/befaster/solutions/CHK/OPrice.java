package befaster.solutions.CHK;

import java.util.Map;

public class OPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('O') * 10;
	}
}
