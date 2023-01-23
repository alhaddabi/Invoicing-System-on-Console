package InvoicingPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shop> itemlist = new ArrayList<Shop>();
		Scanner sr = new Scanner(System.in);
		Shop shop = new Shop();
		Items item = new Items();
		Customer cus = new Customer();
		boolean i = true ;
	
		
		
		System.out.println("====================  Invoicing System  =========================");
		System.out.println("please select from the given menu");
	
		while(i)
		{
			System.out.println("Enter number == 1 == to Add new custoemr");
			System.out.println("Enter number == 2 == to Add new Shop & the items to the invoicing ");
			System.out.println("Enter number == 3 == to print the added Items ");
			System.out.println("Enter number == 4 == to delete any of the report ");
			System.out.println("Enter number == 5 == to change the items");
			System.out.println("Enter number == 6 == to print the invoice");

			System.out.println("Enter number == 10 == to EXit");

			
		int ii = sr.nextInt(); 
		switch (ii)
		{
		case 1:
			shop.ADDcustomer();
	    	break ;
		case 2:
			cus.AddItem();
			// shop have to bee added also here
			break;
		case 3:
			int count = 1;
			System.out.println("==============================="+"invoice Details"+count+"===============================");
			shop.print();
			cus.print();
			break ;
		case 4:
			cus.deleteItems();
		break ;
		case 5:
			cus.changeitemprice();
			break ;
		case 6:
			
			break ;
			
		case 10 : 
			   System.out.println("thanks!!!!!");
		       return;
		    
		
		    }
		}
		sr.close();
	}

}
