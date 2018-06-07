package price;

public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	private int quality;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public double setPrice(double price) {
		this.price = price;
	
int quality = 0;
if(quality<0)
{
	this.quality=0;
}
else
{
	this.price=price;
}
return quality;
	}
 public double getInvoiceAmount()
{
	return quantity*price;
}
public static void main(String[]args)
{
	Invoice invoice1=new Invoice();
	invoice1.setPartNumber("Pen");
	invoice1.setPrice(400);
	invoice1.setPartDescription("bolt");
	invoice1.setQuantity(10);
	invoice1.getInvoiceAmount();
	System.out.println(invoice1.getInvoiceAmount());
}
}
	

	
