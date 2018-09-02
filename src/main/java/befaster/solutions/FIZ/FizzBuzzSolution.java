package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution
{
    public String fizzBuzz(Integer number)
    {
        String numberString = "" + number;
        List<String> words = new ArrayList<>();

        if (number % 3 == 0 || numberString.contains("3"))
        {
            words.add("fizz");
        }

        if (number % 5 == 0 || numberString.contains("5"))
        {
            words.add("buzz");
        }

        if (isDeluxe(number))
        {
            if (number % 2 == 1)
            {
                words.add("fake");
            }

            words.add("deluxe");
        }

        if (words.size() > 0)
        {
            return String.join(" ", words);
        }
        else
        {
            return numberString;
        }
    }

    private boolean isDeluxe(int number)
    {
        String numberString = "" + number;

        if (number % 3 == 0 && numberString.contains("3"))
        {
            return true;
        }

        if (number % 5 == 0 && numberString.contains("5"))
        {
            return true;
        }

        return false;
    }
}
