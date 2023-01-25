package InvoicingPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		mahtods mathod = new mahtods();
		boolean i = true;
		Scanner sr = new Scanner(System.in);

		System.out.println("====================  Invoicing System  =========================");
		while (i) {
			System.out.println("1- Shop Settings");
			System.out.println("2- Manage Shop Items");
			System.out.println("3- EXIT");
			int switch1 = sr.nextInt();

			if (switch1 == 1) {
				boolean manu1 = true;
				while (manu1) {
					System.out.println("1. Load Data");
					System.out.println("2. Set Shop Name");
					System.out.println("3. Set Invoice Header");
					System.out.println("4. Back");
					int choose = sr.nextInt();
					switch (choose) {
					case 1:
						int count = 1;
						System.out.println("======================= Invoices " + count
								+ "==========================================");
						mathod.printCustomerName();
						mathod.print();
						mathod.printInvoicingHeader();
						mathod.printShopDetails();
						count++;
						break;

					case 2:
						mathod.AddshopDetails();
						break;

					case 3:
						mathod.invoiceheardr();
						break;
					case 4:
						manu1 = false;
					}

				}
			}

			else if (switch1 == 2) {
				boolean manu2 = true;
				while (manu2) {
					System.out.println("1. Add Items");
					System.out.println("2. Delete Items");
					System.out.println("3. Change Item Price");
					System.out.println("4. Report: All Invoices");
					System.out.println("5. Report: Statistics)");
					System.out.println("6. Go Back");
					int choose1 = sr.nextInt();
					switch (choose1) {
					case 1:
						System.out.println("=====FIRST Enter the customer details=====");
						mathod.ADDcustomer();
						mathod.AddItem();
						break;
					case 2:
						mathod.deleteItems();
						break;

					case 3:
						mathod.changeitemprice();
						break;

					case 4:
						mathod.countInvoice();

						for (Customer a : mathod.customerList) {
							System.out.println("customer name is : " + a.getCustomerFullName());
						}
						for (InvoicingSystem a : mathod.InvoicList) {
							System.out.println("the invoice date is :" + a.getInvoiceDate() + "/1/2023");
						}
						mathod.totalsales();
						mathod.countItems();
						break;

					case 5:
						mathod.ReportStatistics();
						break;

					case 6:
						manu2 = false;
						break;

					}
				}
			}
			else if (switch1 == 3)
			{
			System.out.println("Are you sure you want to exit?  yes / no");
			String exitt = sr.next();
			if (exitt.equals("yes")) {
				i = false;
				System.out.println("thanks!!!!!!! ");
			} else {
				
			}

		}
		}

		sr.close();
	}

}
