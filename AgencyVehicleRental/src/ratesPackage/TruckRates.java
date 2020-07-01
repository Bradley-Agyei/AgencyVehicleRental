package ratesPackage;

public class TruckRates extends VehicleRates
{
    //constructor
    public TruckRates(double daily_rate, double weekly_rate, double monthly_rate, double mileage_chrg, double daily_insur_rate)
    {
        super(daily_rate, weekly_rate, monthly_rate, mileage_chrg, daily_insur_rate);
        daily_rate = 34.95;
        weekly_rate = 224.95;
        monthly_rate = 797.95;
        mileage_chrg = 0.26;
        daily_insur_rate = 22.95;
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
