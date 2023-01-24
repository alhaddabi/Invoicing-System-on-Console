package InvoicingPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shop> itemlist = new ArrayList<Shop>();
		Scanner sr = new Scanner(System.in);
		mahtods mathod = new mahtods();
		InvoicingSystem invoic = new InvoicingSystem();
		Customer cus = new Customer();
		boolean i = true ;
	
		
		
		System.out.println("====================  Invoicing System  =========================");
		System.out.println("please select from the given menu");
	
		while(i)
		{
			System.out.println("1.  Add new Shop & new customer");
			System.out.println("2.  Add new Shop & the items to the invoicing ");
			System.out.println("3.  Print the added Items ");
			System.out.println("4.  Delete any of the report ");
			System.out.println("5.  Change the items price");
			System.out.println("6.  Report: Statistics");
			System.out.println(" To print the invoice");

			System.out.println("10. EXit");

			
		int ii = sr.nextInt(); 
		switch (ii)
		{
		case 1:
			mathod.AddshopDetails();
			mathod.ADDcustomer();
	    	break ;
		case 2:
			mathod.AddItem();
			// shop have to bee added also here
			break;
		case 3:
			int count = 1;
			System.out.println("==============================="+"invoice Details "+count+"===============================");
			mathod.printShopDetails();
			mathod.printcustomer();
			mathod.print();
			count++;
			break ;
			
		case 4:
		mathod.deleteItems();
		break ;
		case 5:
		mathod.changeitemprice();
			break ;
		case 6:
		   mathod.ReportStatistics();
			break ;
			
		case 10 : 
			   System.out.println("thanks!!!!!");
		       return;
		    }
		}
		sr.close();
	}

}
