package InvoicingPackage;
import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws Exception {

		mahtods mathod = new mahtods();
		boolean i = true ;
	
		 Scanner sr = new Scanner(System.in);

		
		System.out.println("====================  Invoicing System  =========================");
		System.out.println("please select from the given menu");
	
		while(i)
		{
			System.out.println("Shop Settings");
			System.out.println("0   Load data");
			System.out.println("1.  Set Shop Name & new customer");
			System.out.println("2.  Set Invoice Header");
			System.out.println("3.  Add Items ");
			System.out.println("4.  Delete Items ");
			System.out.println("5.  Change Item Price");
			System.out.println("6.  Report All invoice");
			System.out.println("7.  Report: Statistics");
			System.out.println("10. EXit");


		int ii = sr.nextInt(); 
		switch (ii)
		{
		case 0:
			int count = 1 ;
			System.out.println("======================= Invoices "+count+"==========================================");
			mathod.print();
			mathod.printInvoicingHeader();
			count++ ;
		break;
		case 1:
			mathod.AddshopDetails();
			mathod.ADDcustomer();
	    	break ;
		case 2:
			mathod.invoiceheardr();
			break;
		case 3:
			mathod.AddItem();
		break;
		case 4:
			mathod.deleteItems();
			
			break ;
			
		case 5:
			mathod.changeitemprice();
		    break ;
		case 6:
			mathod.countInvoice();
				
				for(Customer a : mathod.customerList)
				{
			      System.out.println("customer name is : "+a.getCustomerFullName());
				}
				for(InvoicingSystem a : mathod.InvoicList)
				{
					System.out.println("the invoice date is :" +a.getInvoiceDate()+"/1/2023");
				}
				mathod.totalsales();
				mathod.countItems();
			
			break;
		case 7 :
			   mathod.ReportStatistics();
			break;
		case 10 :
			System.out.println("Are you sure you want to exit? yes / no ");
			String exit = sr.next();
			if(exit.equals("yes"))
			{
				System.out.println("thanks!!!!");
				return ;
			}
			else 
			{
				i =true ;
			}
			break;
			
			
			
			
			
			
//	mathod.printcustomer();
//			mathod.print();
//		mathod.printShopDetails();
//		break ;
//		case 5:
//		//			mathod.countInvoice();
//			break ;
//		case 6:
//			break ;
//		case 7:
	
//			mathod.allInvoices();
//			count++;
//		break;
//			
//		case 10 : 
//			   System.out.println("thanks!!!!!");
//		       return;
//		    }
//		}
		
	         }
		}
		sr.close();
	}

}
