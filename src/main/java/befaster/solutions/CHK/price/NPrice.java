package befaster.solutions.CHK.price;

import java.util.Map;

public class NPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int newMCount = Math.max(0, itemCounts.get('M') - (itemCounts.get('N') / 3));

		itemCounts.put('M', newMCount);

		return itemCounts.get('N') * 40;
	}
}
