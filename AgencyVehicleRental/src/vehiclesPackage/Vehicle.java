//Program 5 - Corporate Vehicle Rental Agency
//Bradley Agyei
//COSC 237.003
//Fall 2019
package vehiclesPackage;

import ratesPackage.Cost;

public abstract class Vehicle 
{
    //Instance Variables 
    private String description; //make-model-year for cars and SUVs, length for trucks
    private int mpg; //miles per gallon
    private String vin; // vehicle identification number
    private Reservation resv; //Reservation
    private Cost rates; //only assigned when vehicle reserved
    
    //Constructor
    public Vehicle(String description, int mpg, String vin, String resv)
    {
        this.description = description;
        this.mpg = mpg;
        this.vin = vin;
        resv = null;
        rates = null; 
    }
    //Methods
    public String getDescript()
    {
        return description;
    }
    public int getMPG()
    {
        return mpg;
    }
    public String getVIN()
    {
        return vin;
    }
    public Reservation getReservation()
    {
        return resv; 
    }
    public Cost getCost()
    {
        return rates; 
    }
    public void setCost(Cost cost)
    {
        this.rates = cost; 
    }
    public abstract String toString();
    public boolean isReserved()
    {
        return (resv != null);
    }
    public void reserve(Reservation r)
            throws ReservedVehicleException
    {
        this.resv = r;
    }
    public void setReservation(Reservation r)
            throws ReservedVehicleException
    {
        if(!isReserved())
        {
            resv = r;
        }
        else
        {
            throw new ReservedVehicleException();
        }
    }
    
    public void cancelReservation()
            throws UnreservedVehicleException
    {
        if(!isReserved())
        {
            resv = null;
        }
        else 
        {
            throw new UnreservedVehicleException();
        }
        
    }
    
}