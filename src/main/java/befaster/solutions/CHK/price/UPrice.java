package befaster.solutions.CHK.price;

import java.util.Map;

public class UPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int oldUCount = itemCounts.get('U');
		int newUCount = oldUCount - (oldUCount / 4);

		return newUCount * 40;
	}
}
