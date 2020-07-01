//Program 5 - Corporate Vehicle Rental Agency
//Bradley Agyei
//COSC 237.003
//Fall 2019
package accountsPackage;
import java.util.*; 
public class accountTestDriver 
{
    static Accounts acct = new Accounts(); 
    public static void main(String [] args)
            throws AccountNumberNotFoundException, InvalidAcctNumException 
    {
        Scanner input = new Scanner(System.in);
        
        allAccts();
        System.out.println();
        System.out.println("Would you like to add an account?");
        String newAcct = input.next(); 
        {
        if (newAcct.equals("Yes") || newAcct.equals("yes"))
            {
                addAcct();
            }
        else 
            {
                System.out.print("Come back later to add an account!");
            }
        }
    }
    //Companies
    public static void allAccts()
            throws InvalidAcctNumException
    {
        acct.append(new Account("12345", "Sony", false));
        acct.append(new Account("23455", "Microsoft", true));
        acct.append(new Account("43294", "Essentia", true));
        acct.append(new Account("83291", "Deer Park", false));
        acct.append(new Account("23141", "Apple", true)); 
        acct.printAccounts(); 
    }
    //method to add company
    
    public static void addAcct()
            throws InvalidAcctNumException
    {
        boolean prime_customer; 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digit account number.");
        String acctNum = input.next(); 
        System.out.println("Enter company name.");
        String compName = input.next();
        System.out.println("Are you a prime customer?");
        String prime = input.next();
        {
        if (prime.equals("Yes") || prime.equals("yes"))
            {
                prime_customer = true;
            }
        else
            {
                prime_customer = false; 
            }
        }
        acct.append(new Account(acctNum, compName, prime_customer));
        acct.printAccounts(); 
    } 
}
