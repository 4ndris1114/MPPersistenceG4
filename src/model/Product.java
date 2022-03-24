/**
 * 
 */
package model;

import model.ProductType;

/**
 * @author Andriis
 *
 */
public class Product {

	
	private int id;
	private String name;
	private double purchasePrice;
	private double salesPrice;
	private double rentPrice;
	private String countryOfOrigin;
	private int currStock;
	ProductType.type productType;
	
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public Product(String name, double purchasePrice, double salesPrice, double rentPrice, String countryOfOrigin, ProductType.type productType) {
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.rentPrice = rentPrice;
		this.countryOfOrigin = countryOfOrigin;
		this.productType = productType;
		currStock = 1;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the purchasePrice
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}
	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	/**
	 * @return the salesPrice
	 */
	public double getSalesPrice() {
		return salesPrice;
	}
	/**
	 * @param salesPrice the salesPrice to set
	 */
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	/**
	 * @return the rentPrice
	 */
	public double getRentPrice() {
		return rentPrice;
	}
	/**
	 * @param rentPrice the rentPrice to set
	 */
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
	/**
	 * @return the currStock
	 */
	public int getCurrStock() {
		return currStock;
	}
	/**
	 * @param currStock the currStock to set
	 */
	public void setCurrStock(int currStock) {
		this.currStock = currStock;
	}
	/**
	 * @return the productType
	 */
	public ProductType.type getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType.type productType) {
		this.productType = productType;
	}

	
}
