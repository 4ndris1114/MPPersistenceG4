package model;

public class OrderLine {


	private Product product;
	private int amount;
	
	public OrderLine(Product p, int amount) {
		this.product = p;
		this.amount = amount;
	}
	

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	
	public double getOlSalesPrice() {
		return getProduct().getSalesPrice();
	}
	
	public double getOlRentPrice() {
		return getProduct().getRentPrice();
	}

}
