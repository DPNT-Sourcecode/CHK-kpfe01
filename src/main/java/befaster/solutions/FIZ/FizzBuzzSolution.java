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

        if (isDeluxe(numberString))
        {
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

    private boolean isDeluxe(String numberString)
    {
        char[] numberCharacters = numberString.toCharArray();

        if (numberCharacters.length < 2)
        {
            return false;
        }

        char firstCharacter = numberCharacters[0];

        for (char character: numberCharacters)
        {
            if (character != firstCharacter)
            {
                return false;
            }
        }

        return true;
    }
}
