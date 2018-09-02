package befaster.solutions.CHK.price;

import java.util.Map;

public class OPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get('O') * 10;
	}
}
