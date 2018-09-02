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

		int totalCount = sCount + tCount + xCount + yCount + zCount;
		int highestMultipleOfThree = totalCount - (totalCount % 3);

		for (int i = 0; i < highestMultipleOfThree; i++)
		{
			if (xCount > 0)
			{
				xCount--;
			}
			else if (yCount > 0)
			{
				yCount--;
			}
			else if (sCount > 0)
			{
				sCount--;
			}
			else if (tCount > 0)
			{
				tCount--;
			}
			else
			{
				zCount--;
			}
		}

		price += (totalCount / 3) * 45;
		price += sCount * 20;
		price += tCount * 20;
		price += xCount * 17;
		price += yCount * 20;
		price += zCount * 21;

		return price;
	}
}
