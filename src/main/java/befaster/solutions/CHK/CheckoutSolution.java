package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutSolution
{
    private String[] alphabet = new String[]
        {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };

    public Integer checkout(String skus)
    {
        if (!isValid(skus))
        {
            return -1;
        }

        Map<String, Integer> itemCounts = new HashMap<>();

        for (String item: alphabet)
        {
            itemCounts.put(item, getCount(skus, item));
        }

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;
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
            else if (item == 'E')
            {
                eCount++;
            }
            else if (item == 'F')
            {
                fCount++;
            }
        }

        return new Basket(aCount, bCount, cCount, dCount, eCount, fCount).total();
    }

    private boolean isValid(String skus)
    {
        Pattern p = Pattern.compile("[A-Z]*");
        Matcher m = p.matcher(skus);
        return m.matches();
    }

    private int getCount(String skus, String item)
    {
        Pattern p = Pattern.compile("[A-Z]*");
        Matcher m = p.matcher(skus);
        return m.matches();
    }
}
