//Program 5 - Corporate Vehicle Rental Agency
//Bradley Agyei
//COSC 237.003
//Fall 2019
package accountsPackage;

import java.util.*; 
public class Account 
{
    //instance variable
    private String acct_num; //five digit acct number
    private String company_name; 
    private boolean prime_customer;
    
    //constructor
    public Account(String acct_num, String company_name, boolean prime_customer)
    {
        this.acct_num = acct_num;
        this.company_name = company_name;
        this.prime_customer = prime_customer; 
        int length = acct_num.length(); 

    }
    //methods
    public String getAcctNum()
    {
        return acct_num;
    }
    public String getCompanyName()
    {
        return company_name; 
    }
    public boolean primeCustomer(String p)
    {
        return prime_customer; 
    }
    public String toString()
    {
        if (prime_customer == true)
        {
            return ("Account number: " + getAcctNum() + " " + "Company name: " + getCompanyName() + " " + "Prime customer? Yes");
        }
        else
        {
             return ("Account number: " + getAcctNum() + " " + "Company name: " + getCompanyName() + " " + "Prime customer? No");
        }
        
    }
    
}
