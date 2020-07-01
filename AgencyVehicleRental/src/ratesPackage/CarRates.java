package ratesPackage;

public class CarRates extends VehicleRates
{
    //constructor
    public CarRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_chrg, double daily_insur_rate)
    {
        super(daily_rate, weekly_rate, monthly_rate, mileage_chrg, daily_insur_rate);
        daily_rate = 24.95;
        weekly_rate = 149.95;
        monthly_rate = 514.95;  
        mileage_chrg = 0.15;
        daily_insur_rate = 14.95; 
    }
    public String toString()
    {
        return ("Daily rate: " + "$" + getDailyRate() + " " + "Weekly rate: " + "$" + getWeeklyRate() + " " + "Monthly rate: " + "$" + getMonthlyRate() + " " + "Mileage Charge: " + "$" + getMileageChrg() + " " + "Daily insurance rate: " + "$" + getDailyInsurRate()); 
    }
    public Cost cloneAsCostType()
    {
       Cost a = new Cost(getDailyRate(), getWeeklyRate(), getMonthlyRate(), getMileageChrg(), getDailyInsurRate()); 
       
       return a;
    }
}