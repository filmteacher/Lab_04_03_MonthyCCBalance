public class Main
{
    public static void main(String[] args)
    {

        double ccBalance = 5000.00;
        final double INTEREST_RATE = 0.17;
        double oneMonthInterest = ccBalance * INTEREST_RATE;
        double twoMonthInterest = (ccBalance + oneMonthInterest) * INTEREST_RATE;

        System.out.println("The interest due after one month is $" + oneMonthInterest + " and the interest due after two months is $" + twoMonthInterest);
    }
}