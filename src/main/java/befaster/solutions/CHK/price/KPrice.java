package befaster.solutions.CHK.price;

import java.util.Map;

public class KPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int kCount = itemCounts.get('K');

		price += (kCount / 2) * 150;
		kCount = kCount % 2;

		price += kCount * 80;

		return price;
	}
}
