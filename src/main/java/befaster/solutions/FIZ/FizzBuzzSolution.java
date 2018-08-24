package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String numberString = "" + number;
        boolean containsThree = numberString.contains("3");
        boolean containsFive = numberString.contains("5");

        if (number % 15 == 0 || (containsThree && containsFive))
        {
            return "fizz buzz";
        }
        else if (number % 3 == 0 || containsThree)
        {
            return "fizz";
        }
        else if (number % 5 == 0 || containsFive)
        {
            return "buzz";
        }
        else
        {
            return numberString;
        }
    }
}
