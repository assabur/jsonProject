package ufr.uvsq.convertisseur.json2csv;

public class OrderLine 
{
	private String item;
    public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	private int quantity;
    private double unitPrice;
    
    
    
    

}
