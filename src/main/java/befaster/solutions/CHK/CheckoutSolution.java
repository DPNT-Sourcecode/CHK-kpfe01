package befaster.solutions.CHK;

public class CheckoutSolution
{
    public Integer checkout(String skus)
    {
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
            else
            {
                return -1;
            }
        }

        return new Basket(aCount, bCount, cCount, dCount, eCount, fCount).total();
    }
}
