public class Main {
    public static double forecastValues(double initialAmount, double growthRate, int years) {
        if(years == 0) {
            return initialAmount;
        }
        return forecastValues(initialAmount, growthRate, years-1) * (1 + growthRate);
    }
    public static void main(String[] args) {
        double initalAmount = 1000.0;
        double growthRate = 0.05; 
        int years = 10;

        double finalAmount = forecastValues(initalAmount, growthRate, years);
        System.out.printf("The future final value after %d years is: %.2f%n", years, finalAmount);
    }
}