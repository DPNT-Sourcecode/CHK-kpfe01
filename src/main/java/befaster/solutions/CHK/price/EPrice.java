package befaster.solutions.CHK.price;

import java.util.Map;

public class EPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int newBCount = Math.max(0, itemCounts.get('B') - (itemCounts.get('E') / 2));

		itemCounts.put('B', newBCount);

		return itemCounts.get('E') * 40;
	}
}
