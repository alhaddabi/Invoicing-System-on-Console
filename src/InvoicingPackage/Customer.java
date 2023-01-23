package InvoicingPackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer  {
	
	Scanner sr = new Scanner(System.in);
	ArrayList<Items> itemlist = new ArrayList<Items>();
	Items items = new Items();
	
	private String customerFullName ;
	private int customerPhoneNumber ;
	
	
	
	boolean condation1 = true;
	
	
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
	    int itemId = itemlist.size();
	    temitem.setIteamId(itemId);
	    itemlist.add(temitem);
	    
//	    Items items = new Items();
//	    try{
//
//	        FileOutputStream file = new FileOutputStream("serlization4.txt");
//	        ObjectOutputStream out = new ObjectOutputStream(file);
//	        out.writeObject(items);
//	        out.close();
//	        file.close();
//	        System.out.println("===============serialized and saved==================");
//	         }catch (Exception ex){
//	      ex.printStackTrace();
//	    }
	}

	public void print()
	{
		for(Items a : itemlist)
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
		itemlist.get(remove);
		itemlist.remove(remove);
		System.out.println("the item removed");
	}
	
	public void changeitemprice()
	{
		System.out.println("Enter the ID number to iteam you want to change ");
		int induxtnumber = sr.nextInt();
		Items tempItem = new Items();
		tempItem=itemlist.get(induxtnumber);
		System.out.println("Enter the new price ");
		tempItem.setItemsPrice(sr.nextInt());
		itemlist.set(induxtnumber, tempItem);
		System.out.println("the item have been chanced ");
	}
	
	
	
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
}
