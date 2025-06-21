public class FinancialForecasting {

    public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            presentValue *= (1 + growthRate);
        }
        return presentValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        double futureValue = calculateFutureValueIterative(presentValue, growthRate, years);
        System.out.printf("Iterative future value: $%.2f%n", futureValue);
    }
}