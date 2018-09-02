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

        return  totalPrice;
    }
}
