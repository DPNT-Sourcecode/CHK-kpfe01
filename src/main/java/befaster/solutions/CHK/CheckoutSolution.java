package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutSolution
{
    private char[] alphabet = new char[]
        {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

    public Integer checkout(String skus)
    {
        if (!isValid(skus))
        {
            return -1;
        }

        Map<Character, Integer> itemCounts = new HashMap<>();

        for (char item: alphabet)
        {
            itemCounts.put(item, getCount(skus, item));
        }

        int totalPrice = 0;

        totalPrice += new APrice().getPrice(itemCounts);

        return new Basket(itemCounts, totalPrice).total();
    }

    private boolean isValid(String skus)
    {
        Pattern p = Pattern.compile("[A-Z]*");
        Matcher m = p.matcher(skus);
        return m.matches();
    }

    private int getCount(String skus, char item)
    {
        int count = 0;

        for (char letter: skus.toCharArray())
        {
            if (letter == item)
            {
                count++;
            }
        }

        return count;
    }
}
