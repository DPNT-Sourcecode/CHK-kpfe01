package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private List<String> getItems(String skus)
    {
        List<String> items = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d*[A-D]");
        Matcher matcher = pattern.matcher(skus);

        while (matcher.find())
        {
            items.add(matcher.group());
        }

        return items;
    }
}
