package InvoicingPackage;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Items implements Serializable {
	
	Scanner sr = new Scanner(System.in);
	private int numberOfItems ;
	private int iteamId ;
	private String itemaName ;
	private int itemsPrice ;
	
	public void AddItems ()
	{
		System.out.println("please Enter the items name ");
		itemaName = sr.next();
		System.out.println("Enter the items price");
		itemsPrice = sr.nextInt();
		System.out.println("please Enter the number of iteams");
		numberOfItems = sr.nextInt();
		System.out.println("please Enter the iteams ID ");
		iteamId = sr.nextInt();
		
		
		Items i = new Items();
		  try{
		    	
		        FileOutputStream file = new FileOutputStream("serlization4.txt");
		        ObjectOutputStream out = new ObjectOutputStream(file);
		        out.writeObject(i);
		        out.close();
		        file.close();
		        System.out.println("===============serialized and saved==================");
		         }catch (Exception ex){
		      ex.printStackTrace();
		    }
	}
		
		public void DeleteItems()
		{
			System.out.println("Which items you want to delete");
			String deleteItems = sr.next();
			if(deleteItems == itemaName)
			{
				itemaName.replace(" ","");
			}
		}
		
		public void printInvocing()
		{
			System.out.println("the name is " +this.itemaName);
			System.out.println("the name is " +this.iteamId);
			System.out.println("the name is " +this.numberOfItems);
			System.out.println("the name is " +this.itemsPrice);
		}
		public void GoBack()
		{
			
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
