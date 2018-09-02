package befaster.solutions.CHK.price;

import java.util.Map;

public class SimplePrice implements Price
{
	private char letter;

	private int price;

	public SimplePrice(char letter, int price)
	{
		this.letter = letter;
		this.price = price;
	}

	@Override
	public int getPrice(Map<Character, Integer> itemCounts)
	{
		return itemCounts.get(letter) * price;
	}
}
