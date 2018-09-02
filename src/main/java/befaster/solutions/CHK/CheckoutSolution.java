package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution
{
    private Map<Character, Integer> prices = new HashMap<>();

    public CheckoutSolution()
    {
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);
    }

    public Integer checkout(String skus)
    {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        char[] items = skus.toCharArray();

        for (char item: items)
        {
            if (item == 'A')
            {
                aCount++;
            }
            else if (item == 'B')
            {
                bCount++;
            }
            else if (item == 'C')
            {
                cCount++;
            }
            else if (item == 'D')
            {
                dCount++;
            }
        }

        return aCount * 50 + bCount * 30 + cCount * 20 + dCount * 15;
    }
}
