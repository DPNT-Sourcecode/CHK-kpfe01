package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String numberString = "" + number;

        if (number % 15 == 0)
        {
            return "fizz buzz";
        }
        else if (number % 3 == 0 || numberString.contains("3"))
        {
            return "fizz";
        }
        else if (number % 5 == 0 || numberString.contains("5"))
        {
            return "buzz";
        }
        else
        {
            return numberString;
        }
    }
}
