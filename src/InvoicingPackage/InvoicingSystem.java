package InvoicingPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoicingSystem {
	
	ArrayList<Items> itemlist = new ArrayList<Items>();
	Customer cus = new Customer();
	Scanner sr = new Scanner(System.in);
	
	private int invoicingDate ;
	private int numberOfItems ;
	private int numberOfInvoice ;
	private int totalSales ;
	private int invoiceNumnber ;
	private int invoiceDate ;
	private String customerName ;
	private int numbrOfItems ;
	private int totalBalanc ;
	private int fax ;
	private int tel ;
	private String email ;
	private String webSite ;
	
	
	
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public int getInvoiceNumnber() {
		return invoiceNumnber;
	}
	public void setInvoiceNumnber(int invoiceNumnber) {
		this.invoiceNumnber = invoiceNumnber;
	}
	public int getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(int invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getNumbrOfItems() {
		return numbrOfItems;
	}
	public void setNumbrOfItems(int numbrOfItems) {
		this.numbrOfItems = numbrOfItems;
	}
	public int getTotalBalanc() {
		return totalBalanc;
	}
	public void setTotalBalanc(int totalBalanc) {
		this.totalBalanc = totalBalanc;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public int getNumberOfInvoice() {
		return numberOfInvoice;
	}
	public void setNumberOfInvoice(int numberOfInvoice) {
		this.numberOfInvoice = numberOfInvoice;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	
	public int getInvoicingDate() {
		return invoicingDate;
	}
	public void setInvoicingDate(int invoicingDate) {
		this.invoicingDate = invoicingDate;
	}	
}
