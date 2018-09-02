package befaster.solutions.CHK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutSolution
{
    public Integer checkout(String skus)
    {
        if (!isValid(skus))
        {
            return -1;
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
}
