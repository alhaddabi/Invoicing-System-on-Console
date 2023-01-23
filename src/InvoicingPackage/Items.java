package InvoicingPackage;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Items implements Serializable {
	
	
	
	ArrayList<InvoicingSystem> invoo = new ArrayList<InvoicingSystem>();
	InvoicingSystem invo = new InvoicingSystem();
	
	Scanner sr = new Scanner(System.in);
	private int numberOfItems ;
	private int iteamId ;
	private String itemaName ;
	private int itemsPrice ;
	
	boolean condation = true ;
	
	
	
		
		public void printInvocing()
		{
			System.out.println("the name is " +this.itemaName);
			System.out.println("the name is " +this.iteamId);
			System.out.println("the name is " +this.numberOfItems);
			System.out.println("the name is " +this.itemsPrice);
		}

		public int getItemsPrice() {
			return itemsPrice;
		}

		public void setItemsPrice(int itemsPrice) {
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
