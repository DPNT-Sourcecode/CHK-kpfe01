package befaster.solutions.CHK.price;

import java.util.Map;

public class VPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int vCount = itemCounts.get('V');

		price += (vCount / 3) * 130;
		vCount = vCount % 3;

		price += (vCount / 2) * 90;
		vCount = vCount % 2;

		price += vCount * 50;

		return price;
	}
}
