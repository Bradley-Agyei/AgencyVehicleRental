package ratesPackage;

public class ratesTestDriver 
{
    public static void main(String[] args)
    {
        CarRates c = new CarRates(24.95, 149.95, 514.95, .15, 14.95);
        SUVRates s = new SUVRates(29.95, 189.95, 679.95, 0.15, 14.95);
        TruckRates t = new TruckRates(34.95, 224.95, 797.95, 0.26, 22.95);
        
        Rates r = new Rates(c, s, t); 
        
        System.out.println(r.getCarRates());
        System.out.println(r.getSUVRates());
        System.out.println(r.getTruckRates());
    }
}
