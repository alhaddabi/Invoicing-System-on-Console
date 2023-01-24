package InvoicingPackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer  {
	
	Scanner sr = new Scanner(System.in);

	Items items = new Items();
	
	private String customerFullName ;
	private int customerPhoneNumber ;
	
	
	
	boolean condation1 = true;
	
	
	    
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
