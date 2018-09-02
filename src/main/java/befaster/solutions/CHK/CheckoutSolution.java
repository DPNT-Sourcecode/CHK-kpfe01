package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution
{
    private Map<String, Integer> prices = new HashMap<>();

    public CheckoutSolution()
    {
        prices.put("A", 50);
        prices.put("B", 30);
        prices.put("C", 20);
        prices.put("D", 15);
    }

    public Integer checkout(String skus)
    {
        int totalPrice = 0;
        char[] items = skus.toCharArray();

        for (char item: items)
        {
            totalPrice += prices.get(item);
        }

        return  totalPrice;
    }
}
