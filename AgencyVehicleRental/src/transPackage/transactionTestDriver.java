package transPackage;
import java.util.*; 
public class transactionTestDriver 
{
    static Transactions trans = new Transactions(100); 
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); 
        
        allTrans(trans); 
        displayAll(); 
    }
    public static void allTrans(Transactions trans)
    {
        trans.add(new Transaction("21323", "Disney", "Car", "2 weeks", "$90"));
        trans.add(new Transaction("43274", "Microsoft", "Truck", "1 month", "$305"));
        trans.add(new Transaction("47812", "Wale", "Truck", "3 weeks", "$300"));
        trans.add(new Transaction("47123", "Godwin", "SUV", "9 months", "$30"));
        trans.add(new Transaction("23013", "Apple", "Car", "2 days", "$50"));
    }
    public static void displayAll()
    {
        while(trans.hasNext())
        {
            System.out.println(trans.getCurrent());
            trans.getNext();
        }
        trans.reset(); 
    }
}
