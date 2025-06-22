public class FinancialForecasting {

    public static double forecastRecursive(double pv, double growth, int n) {
        if (n == 0) return pv;
        return forecastRecursive(pv, growth, n - 1) * (1 + growth);
    }

    public static double forecastIterative(double pv, double growth, int n) {
        double result = pv;
        for (int i = 0; i < n; i++) {
            result *= (1 + growth);
        }
        return result;
    }

    public static void main(String[] args) {
        double pv = 1000.0;
        double growth = 0.05;
        int n = 10;

        System.out.println("\nForecast using recursion:");
        double recResult = forecastRecursive(pv, growth, n);
        System.out.printf("Value after %d years: Rs.%.2f%n", n, recResult);

        System.out.println("\nForecast using loop:");
        double iterResult = forecastIterative(pv, growth, n);
        System.out.printf("Value after %d years: Rs.%.2f%n", n, iterResult);
    }
}
