package befaster.solutions.CHK;

public class CheckoutSolution
{
    public Integer checkout(String skus)
    {
        int totalPrice = 0;

        if (skus.contains("A"))
        {
            totalPrice += 50;
        }

        if (skus.contains("B"))
        {
            totalPrice += 30;
        }

        if (skus.contains("C"))
        {
            totalPrice += 20;
        }

        if (skus.contains("D"))
        {
            totalPrice += 15;
        }

        return  totalPrice;
    }
}
