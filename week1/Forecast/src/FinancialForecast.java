public class FinancialForecast {


    public static double forecastValue(double currentValue, double growthRate, int years) {
    
        if (years == 0) {
            return currentValue;
        }
        
        return forecastValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000;       
        double annualGrowthRate = 0.10;   
        int years = 5;

        double futureValue = forecastValue(presentValue, annualGrowthRate, years);
        System.out.printf("Forecasted value after %d years: ₹%.2f%n", years, futureValue);
    }
}
