package befaster.solutions.CHK.price;

import java.util.Map;

public class QPrice implements Price
{
	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		int price = 0;
		int qCount = itemCounts.get('Q');

		price += (qCount / 3) * 80;
		qCount = qCount % 3;

		price += qCount * 30;

		return price;
	}
}
