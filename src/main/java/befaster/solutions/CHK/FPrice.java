package befaster.solutions.CHK;

import java.util.Map;

public class FPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int oldFCount = itemCounts.get('F');
		int newFCount = oldFCount - (oldFCount / 3);

		return newFCount * 10;
	}
}
