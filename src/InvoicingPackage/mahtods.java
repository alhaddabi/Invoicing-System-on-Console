package InvoicingPackage;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class mahtods {
	
	
	transient Scanner sr = new Scanner(System.in);
	ArrayList<Shop> shopList = new ArrayList<Shop>();
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Items> itemList = new ArrayList<Items>();
	ArrayList<InvoicingSystem> InvoicList = new ArrayList<InvoicingSystem>();

	//////////////////////////////////////////////SHOP/////////////////////////////////////////////////////////////////////////////////////
	public void AddshopDetails()
	     {
		Shop temShop = new Shop();
		System.out.println("Enter the shop name ");
		String shopName = sr.next();
		temShop.setShopName(shopName);
		shopList.add(temShop);
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
//	    
//	
//	    try{
//
//	        FileOutputStream file = new FileOutputStream("serlization4.txt");
//	        ObjectOutputStream out = new ObjectOutputStream(file);
//	        out.writeObject(temitem);
//	        out.close();
//	        file.close();
//	        System.out.println("===============serialized and saved==================");
//	         }catch (Exception ex){
//	      ex.printStackTrace();
//	    }
//	
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
		itemList.get(remove);
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
