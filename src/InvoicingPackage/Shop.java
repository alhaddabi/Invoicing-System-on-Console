package InvoicingPackage;
import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
	
	Scanner sr = new Scanner(System.in);
	ArrayList<Customer> customerlist = new ArrayList<Customer>();

	
	private String shopName ;
	private int shopID ;
	
	
	public void ADDcustomer()
	{
		Customer customer = new Customer();
		System.out.println("Enter the customer name");
		String customerName = sr.next();
		customer.setCustomerFullName(customerName);
		System.out.println("Enter the custoemr ID ");
		int customerPhomeNumber = sr.nextInt();
		customer.setCustomerPhoneNumber(customerPhomeNumber);
		customerlist.add(customer);
	}
	
	public void print()
	{
		for(Customer a : customerlist)
		{
			System.out.println("customer full name is : "+a.getCustomerFullName());
			System.out.println("customer phone is     : "+a.getCustomerPhoneNumber());

		}
	}

	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	
	
}
