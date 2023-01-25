package InvoicingPackage;
import java.util.ArrayList;
import java.util.Scanner;


public class Items {
	
	

	ArrayList<InvoicingSystem> invoo = new ArrayList<InvoicingSystem>();
	
	transient Scanner sr = new Scanner(System.in);
	private int numberOfItems ;
	private int iteamId ;
	private String itemaName ;
	private double itemsPrice ;
	
	
	InvoicingSystem invoice = new InvoicingSystem();
	
        
	public void balance()
	{
		
	}
	
	

		public void printInvocing()
		{
			System.out.println("the name is " +this.itemaName);
			System.out.println("the name is " +this.iteamId);
			System.out.println("the name is " +this.numberOfItems);
			System.out.println("the name is " +this.itemsPrice);
		}

		public double getItemsPrice() {
			return itemsPrice;
		}

		public void setItemsPrice(double itemsPrice) {
			this.itemsPrice = itemsPrice;
		}

		public int getNumberOfItems() {
			return numberOfItems;
		}

		public void setNumberOfItems(int numberOfItems) {
			this.numberOfItems = numberOfItems;
		}

		public int getIteamId() {
			return iteamId;
		}

		public void setIteamId(int iteamId) {
			this.iteamId = iteamId;
		}

		public String getItemaName() {
			return itemaName;
		}

		public void setItemaName(String itemaName) {
			this.itemaName = itemaName;
		}
	
}
