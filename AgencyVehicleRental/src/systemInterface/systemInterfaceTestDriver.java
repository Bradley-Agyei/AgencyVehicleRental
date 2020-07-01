
package systemInterface;
import vehiclesPackage.*;
import ratesPackage.*; 
import accountsPackage.*; 
import transPackage.*; 
public class systemInterfaceTestDriver 
{
	public static void main(String [] args)
	{
		systemInterface.initSystem(createRates(), createVehicles(), createAccounts(), createTransactions());

		print(systemInterface.getCarRates());
		System.out.println();
		print(systemInterface.getSUVRates());
		System.out.println();
		print(systemInterface.getTruckRates()); 
		System.out.println();
		print(systemInterface.updateCarRates(new CarRates(23.32, 140.32, 510.23, 0.12, 12.32)));
		System.out.println();
		print(systemInterface.updateSUVRates(new SUVRates(26.43, 190.32, 689.32, 0.10, 12.32)));
		System.out.println();
		print(systemInterface.updateTruckRates(new TruckRates(32.83, 221.32, 790.23, 0.23, 21.84))); 
		System.out.println();
		print(systemInterface.getAvailCar());
		System.out.println();
		print(systemInterface.getAvailSUVs());
		System.out.println();
		print(systemInterface.getAvailTrucks()); 
		System.out.println();
		print(systemInterface.getAllVehicles()); 
		System.out.println();

		System.out.println();
		
		print(systemInterface.estimatedRentalCost(new RentalDetails(2, "M2", 23, true, true)));
		print(systemInterface.estimatedRentalCost(new RentalDetails(3, "D7", 113, true, true)));
		System.out.println();
		/*
		try {
		print(systemInterface.processReturnedVehicle("HK4GM4565GD", 3, 23)); 
		}
		catch(VINNotFoundException e) {
			
		}
		*/
		System.out.println();
		
		try {
		print(systemInterface.makeReservation(new ReservationDetails("HK4GM4565GD", 23132, 1, "D4", true)));
		systemInterface.makeReservation(new ReservationDetails("KU4EG3245RW", 32613, 2, "W3", false));
		}
		catch(ReservedVehicleException | VINNotFoundException e)
		{
			
		}
		
		System.out.println();
		try { 
		print(systemInterface.getReservation("HK4GM4565GD")); 
		}
		catch(VINNotFoundException e)
		{
			
		}
		System.out.println();
		try {
			print(systemInterface.cancelReservation("HK4GM4565GD")); 
		}
		catch(VINNotFoundException | UnreservedVehicleException e)
		{
			
		}
		System.out.println("All Reservations");
		print(systemInterface.getAllReservations());
		System.out.println();
		print(systemInterface.addAccount("23132", "Wale Inc", true)); 
		print(systemInterface.addAccount("43535" , "Apple", false)); 
		try {
		print(systemInterface.getAccount(23132)); 
		}
		catch(AccountNumberNotFoundException e) 
		{
			
		}
		System.out.println();
		System.out.println("All Accounts:");
		System.out.println();
		print(systemInterface.getAllAccounts()); 
		System.out.println();
		System.out.println("Transaction:");
		try {
		print(systemInterface.addTransaction("23132", "Wale Inc", "Car", "D3", "231.32"));
		}
		catch(InvalidAcctNumException e) {
			
		}
		System.out.println();
		System.out.println("All Transactions");
		
		print(systemInterface.getAllTransactions()); 
		
	}

	public static Rates createRates()
	{
		return (new Rates(new CarRates(24.95, 149.95, 514.95, 0.15, 14.95),
				new SUVRates(29.95, 189.95, 679.95, 0.15, 14.95),
				new TruckRates(34.95, 224.95, 797.95, 0.26, 22.95))); 
	}

	public static Vehicles createVehicles()
	{
		Vehicles v = new Vehicles(100);

		v.add(new Car("Chevrolet Camaro - 2018", 30, "HK4GM4565GD", "n", 2));
		v.add(new Car("Ford Fusion - 2019", 34, "AB4FG5689GM", "n", 4));
		v.add(new Car("Ford Fusion Hybrid - 2017", 32, "KU4EG3245RW", "n", 4));
		v.add(new Car("Chevrolet Impala - 2019", 30, "RK3BM4256YH", "n", 4));
		v.add(new SUV("Honda Odyssey", 28, "VM9RF2635TD", "n", 7, 6)); 
		v.add(new SUV("Dodge Caravan", 25, "QK3FL4273ME", "n", 5, 4));
		v.add(new SUV("Ford Expedition", 20, "JK2RT9364HY", "n", 5, 3));
		v.add(new Truck("Ten-Foot", 12, "EJ5KU2435BC", "n", 2810)); 
		v.add(new Truck("Seventeen-Foot", 10, "KG4DM5472RK", "n", 5930)); 
		v.add(new Truck("Twenty-Four-Foot", 8, "EB2WR3082QB", "n", 6500)); 
		v.add(new Truck("Twenty-Four-Foot", 8, "TW3GH4290EK", "n", 6500)); 
		return v; 
	}

	public static Transactions createTransactions()
	{
		Transactions trans = new Transactions(100); 
		trans.add(new Transaction("21323", "Disney", "Car", "W2", "90"));
		trans.add(new Transaction("43274", "Microsoft", "Truck", "M1", "305"));
		trans.add(new Transaction("47812", "Wale", "Truck", "W3", "300"));
		trans.add(new Transaction("47123", "Godwin", "SUV", "M9", "30"));
		trans.add(new Transaction("23013", "Apple", "Car", "D2", "50"));
		return trans; 
	}
	public static Accounts createAccounts()
	{
		Accounts acct = new Accounts(); 
		acct.append(new Account("12345", "Sony", false));
		acct.append(new Account("23455", "Microsoft", true));
		acct.append(new Account("43294", "Essentia", true));
		acct.append(new Account("83291", "Deer Park", false));
		acct.append(new Account("23141", "Apple", true)); 
		//acct.printAccounts(); 
		return acct; 
	}
	public static void print(String [] a)
	{
		for(String string: a)
		{
			System.out.println(string); 
		}
	}
}
