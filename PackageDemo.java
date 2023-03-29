package mypackage;
import mysecondpackage.Customer;
public class PackageDemo
{
	public static void main(String args[])
	{
		System.out.println("Package Demo");
		Bank.display();
		Customer.displayCustomer();
	}
}