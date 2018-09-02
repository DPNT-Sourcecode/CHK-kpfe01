package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckoutSolution
{
    private Map<String, Integer> prices = new HashMap<>();

    {
        prices.put("A", 50);
        prices.put("B", 30);
        prices.put("C", 20);
        prices.put("D", 15);
    }

    public Integer checkout(String skus)
    {
        int totalPrice = 0;
        List<String> items = getItems(skus);

        for (String item: items)
        {
            String sku = item.substring(item.length() - 1);
            int itemPrice = prices.get(sku);

            totalPrice += itemPrice;
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
