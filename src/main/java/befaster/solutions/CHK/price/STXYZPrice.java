package befaster.solutions.CHK.price;

import java.util.Map;

public class STXYZPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;

		int sCount = itemCounts.get('S');
		int tCount = itemCounts.get('T');
		int xCount = itemCounts.get('X');
		int yCount = itemCounts.get('Y');
		int zCount = itemCounts.get('Z');

		price += sCount * 20;
		price += tCount * 20;
		price += xCount * 17;
		price += yCount * 20;
		price += zCount * 21;

		return price;
	}
}
