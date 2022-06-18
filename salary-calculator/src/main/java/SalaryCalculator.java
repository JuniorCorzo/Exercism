public class SalaryCalculator {

    
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped >= 5 ? 1 * 0.15 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000;

        salary -= (multiplierPerDaysSkipped(daysSkipped) != 1) ? salary * multiplierPerDaysSkipped(daysSkipped) : 0;
        salary += productsSold != 0 ? bonusForProductSold(productsSold) : 0; 

        return salary < 2000 ? salary : 2000;
    } 
}
