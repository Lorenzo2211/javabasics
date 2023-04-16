package javabasics._15;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        double interestGainedThisYearEuros = 0;
        int yearsPast = 0;


        do {
            double previousYearsInvestment = currentInvestmentValueEuros;

            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;

            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;

            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);

        } while (currentInvestmentValueEuros <= 15_000 || yearsPast <= 5);
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate =  1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        // Write your while loop here
            while (poundToEuroExchangeRate < 1.15 || remainingPoundsToSell != 0) {
                daysToSell++;
                poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
                if (poundToEuroExchangeRate >= 1.15) {
                    remainingPoundsToSell = remainingPoundsToSell - maxPoundsToSellPerDay;
                }
            }
        System.out.println("It took " + daysToSell + " days to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: We should use a do while loop, because we always want to check at least 1 action performed by the user. And we don't know how many actions it will take.
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2: We should use a for each or for i loop, because we have a certain number of emails to send. So for each would be simpler than for i.
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: We should use a for i loop, going from index 0 to 79 to process the 80 items. Should there be multiple elements, the for each will process them as well.
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: We should use a while loop, as we only want to read the file if there are lines, but we're not reading the whole file at once, we don't know how many lines there are, so the for loop isn't appropriate.
     */
}
