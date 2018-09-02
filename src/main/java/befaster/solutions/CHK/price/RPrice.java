package befaster.solutions.CHK.price;

import java.util.Map;

public class RPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int newBCount = Math.max(0, itemCounts.get('Q') - (itemCounts.get('R') / 3));

		itemCounts.put('Q', newBCount);

		return itemCounts.get('R') * 50;
	}
}
