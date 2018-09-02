package befaster.solutions.CHK;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutSolution
{
    private List<Price> prices =
        Arrays.asList(
            new OPrice(), new NPrice(), new MPrice(), new LPrice(), new KPrice(),
            new JPrice(), new IPrice(), new HPrice(), new GPrice(), new FPrice(),
            new EPrice(), new DPrice(), new CPrice(), new BPrice(), new APrice());

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

        for (Price price: prices)
        {
            totalPrice += price.getPrice(itemCounts);
        }

        return totalPrice;
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
