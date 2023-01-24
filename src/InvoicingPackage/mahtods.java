package InvoicingPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class mahtods {
	
	
	Scanner sr = new Scanner(System.in);
	ArrayList<Shop> shopList = new ArrayList<Shop>();
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Items> itemList = new ArrayList<Items>();



	//////////////////////////////////////////////SHOP/////////////////////////////////////////////////////////////////////////////////////
	public void AddshopDetails()
	     {
		Shop temShop = new Shop();
		System.out.println("Enter the shop name ");
		String shopName = sr.next();
		temShop.setShopName(shopName);
		System.out.println("Enter the shop ID ");
		int shopId = sr.nextInt();
		temShop.setShopID(shopId);
		shopList.add(temShop);
		}
	
	public void printShopDetails()
	{
		for (Shop a : shopList)
		{
		System.out.println("the shop name is : "+a.getShopName()+"======");
		System.out.println("the shopn ID is  :    "+a.getShopID()+"======");
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
		int invoice = 0;
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
	
	public void ReportStatistics()
	{
		
			countItems();
			countInvoice();
			totalsales();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
