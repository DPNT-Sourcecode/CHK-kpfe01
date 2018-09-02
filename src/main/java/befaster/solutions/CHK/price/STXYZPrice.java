package befaster.solutions.CHK.price;

import java.util.Map;

public class STXYZPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;

		price += itemCounts.get('S') * 20;
		price += itemCounts.get('T') * 20;
		price += itemCounts.get('X') * 17;
		price += itemCounts.get('Y') * 20;
		price += itemCounts.get('Z') * 21;

		return price;
	}
}
