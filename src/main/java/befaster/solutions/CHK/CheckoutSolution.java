package befaster.solutions.CHK;

public class CheckoutSolution
{
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

        int totalPrice = 0;

        if (aCount == 3)
        {
            totalPrice += 130;
        }
        else
        {
            totalPrice += aCount * 50;
        }

        if (bCount == 2)
        {
            totalPrice += 45;
        }
        else
        {
            totalPrice += bCount * 30;
        }

        totalPrice += cCount * 20;
        totalPrice += dCount * 15;

        return totalPrice;
    }
}
