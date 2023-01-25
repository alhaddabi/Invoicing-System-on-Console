package InvoicingPackage;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mahtods implements Serializable{
	
	
	transient Scanner sr = new Scanner(System.in);
	ArrayList<Shop> shopList = new ArrayList<Shop>();
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Items> itemList = new ArrayList<Items>();
	ArrayList<InvoicingSystem> InvoicList = new ArrayList<InvoicingSystem>();

	//////////////////////////////////////////////SHOP/////////////////////////////////////////////////////////////////////////////////////
	public void AddshopDetails()
	     {
		boolean t1 = false;
		do {
			t1 = false ;
		try // for handing the exception 
		{
		Shop temShop = new Shop();
		System.out.println("Enter the shop name ");
		String shopName = sr.next();
		System.out.println("Enter the shop ID ");
		int shopId = sr.nextInt();
		temShop.setShopId(shopId);
		temShop.setShopName(shopName);
		shopList.add(temShop);
		}
		 catch (InputMismatchException w) { // for handing the try and showing the given pritn insted of showing an error excpation
				System.out.println("who comes the ID could be a String!!!!!! please focuse and repet ");
				t1 = true;
				sr.nextLine(); // with out the sc.nextLine() there will be an infinty loop going 
			}
	      }while(t1); //  we have to do (do - while) to make the condation happen
		
		}
	
	public void printShopDetails()
	{
		for (Shop a : shopList)
		{
		System.out.println("the shop name is : "+a.getShopName()+"======");
		}
	
	}

	
	
	////////////////////////////////////////////////////ITEMS//////////////////////////////////////////////////////////////////////////////////
	

	public void AddItem() {
	   	Items temitem = new Items();
	    System.out.println("please Enter the items name ");
	    String itemnam = sr.next();
	    temitem.setItemaName(itemnam);
	    System.out.println("Enter the items price");
	    int price = sr.nextInt();
	    temitem.setItemsPrice(price);
	    System.out.println("please Enter the number of iteams");
	    int itemnumber = sr.nextInt();
	    temitem.setNumberOfItems(itemnumber);
  //  System.out.println("item ID is automaticlyy generated based on the indext ");
	    int itemId = itemList.size();
	    temitem.setIteamId(itemId);
	    itemList.add(temitem);
	    try
	    {
	    	BufferedWriter writer = new BufferedWriter(new FileWriter("item_output.txt"));
	    	for(Items a : itemList)
			{
				writer.write("the Customer name is : "+a.getItemaName()+"======\n");
				writer.write("the item price is :    "+a.getItemsPrice()+"======\n");
				writer.write("the item number is :   "+a.getNumberOfItems()+"======\n");
				writer.write("the item ID is :       "+a.getIteamId()+"======\n");
			}
	    	writer.close();
	    }catch (IOException o) {		
			o.printStackTrace();
			
		}
	
	    }
	
	
		
	public void print()
	{
		for(Items a : itemList)
		{
			System.out.println("the Customer name is : "+a.getItemaName()+"======");
			System.out.println("the item price is :    "+a.getItemsPrice()+"======");
			System.out.println("the item number is :   "+a.getNumberOfItems()+"======");
			System.out.println("the item ID is :       "+a.getIteamId()+"======");
		}
	}
	
	public void deleteItems()
	{
		System.out.println("Enter the id number to remove");
		int remove = sr.nextInt();
		itemList.get(remove);// get or set . arrayList is always based on the indext number (what every number you type i'll consider as indext )
		itemList.remove(remove);
		System.out.println("the item removed");
	}
	
	public void changeitemprice()
	{
		System.out.println("Enter the ID number to iteam you want to change ");
		int induxtnumber = sr.nextInt();
		Items tempItem = new Items();
		tempItem=itemList.get(induxtnumber);
		System.out.println("Enter the new price ");
		tempItem.setItemsPrice(sr.nextInt());
		itemList.set(induxtnumber, tempItem);
		System.out.println("the item have been chanced ");
	}
	
	public void countItems()
	{
		int totalItems = 0 ;
		for(Items a : itemList)
		{
			totalItems = totalItems + a.getNumberOfItems();
			
		}
		System.out.println("The total Items is : "+totalItems);
	}
	
	public void totalsales() 
	{
		int totalPrice = 0;
		for(Items a : itemList)
		{
			totalPrice = totalPrice + a.getItemsPrice();
			
		}
		System.out.println("The total price is : "+totalPrice);
	}
	
	public void countInvoice()
	{
		int invoice = 1;
		for(Items a : itemList)
		{
			invoice = invoice + a.getIteamId();
			
		}
		System.out.println("The total invoice number is : "+invoice);
	}
	
	

	//////////////////////////////////////////////CUSTOMER///////////////////////////////////////////////////////////////////////////////////////
	
	public void ADDcustomer()
	{
		Customer customer = new Customer();
		System.out.println("Enter the customer name");
		String customerName = sr.next();
		customer.setCustomerFullName(customerName);
		System.out.println("Enter the custoemr ID ");
		int customerPhomeNumber = sr.nextInt();
		customer.setCustomerPhoneNumber(customerPhomeNumber);
		customerList.add(customer);
	}
	
	public void printcustomer()
	{
		for(Customer a : customerList)
		{
			System.out.println("customer full name is : "+a.getCustomerFullName());
			System.out.println("customer phone is     : "+a.getCustomerPhoneNumber());

		}
	}
	
	/////////////////////////////////////////////////////////////////////InvoicingSystem///////////////////////////////////////////////////////////
	public void invoiceheardr()
	{
		InvoicingSystem temInvoic = new InvoicingSystem();
	    System.out.println("please Enter the invoice Fax name ");
	    int invoiceFax = sr.nextInt();
	    temInvoic.setFax(invoiceFax);
	    System.out.println("Enter the invoice tel");
	    int invoiceTel = sr.nextInt();
	    temInvoic.setTel(invoiceTel);
	    System.out.println("please Enter the invoice Email");
	    String invoiceEmail = sr.next();
	    temInvoic.setEmail(invoiceEmail);
	    System.out.println("Enter the todays date ");
	    int date = sr.nextInt();
	    temInvoic.setInvoiceDate(date);
	    InvoicList.add(temInvoic);
	}
	
	public void printInvoicingHeader()
	{
		for(InvoicingSystem a : InvoicList)
		{
			System.out.println("Fax is : "+a.getFax());
			System.out.println("tel number is : "+a.getTel());
			System.out.println("Fax is : "+a.getEmail());

		}

	}

	
	public void invoiceDate()
	{
		for(InvoicingSystem a : InvoicList)
		{
			System.out.println("invoice date is "+a.getInvoiceDate()+"/1/2023");
		}
	
	}
	
	public void ReportStatistics()
	{
			countItems();
			countInvoice();
			totalsales();	
	}
	
	
	
	public void allInvoices()
	{
		countInvoice();
		invoiceDate();
		for(Customer a : customerList)
		{
		System.out.println("Custoemr name is : "+a.getCustomerFullName());
		}
		countItems();
		totalsales();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
