package befaster.solutions.CHK;

import befaster.solutions.CHK.price.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutSolution
{
    private List<Price> prices =
        Arrays.asList(
            new STXYZPrice(),
            new SimplePrice('W', 20),
            new VPrice(),
            new UPrice(),
            new RPrice(),
            new QPrice(),
            new PPrice(),
            new SimplePrice('O', 10),
            new NPrice(),
            new SimplePrice('M', 15),
            new SimplePrice('L', 90),
            new KPrice(),
            new SimplePrice('J', 60),
            new SimplePrice('I', 35),
            new HPrice(),
            new SimplePrice('G', 20),
            new FPrice(),
            new EPrice(),
            new SimplePrice('D', 15),
            new SimplePrice('C', 20),
            new BPrice(),
            new APrice());

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
