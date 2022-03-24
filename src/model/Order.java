package model;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private int id;
	private LocalDate date;
	private double amount;
	private String deliveryStatus;
	private LocalDate deliveryDate;
	private Entity customer;
	private List<OrderLine> orderLines;
	private LocalDate returnDate;
	
	//Constructor for renting
	public Order(LocalDate returnDate, List<OrderLine> orderLines) {
		date = LocalDate.now();
		amount = 0;
		for (OrderLine ol: orderLines) {
			amount += ol.getOlRentPrice();
		}
		deliveryStatus = "On the way";
		customer = null;
		this.orderLines = orderLines;
		this.returnDate = returnDate;
	}
	
	//constructor for purchase
	public Order(List<OrderLine> orderLines) {
		date = LocalDate.now();
		amount = 0;
		for (OrderLine ol: orderLines) {
			amount += ol.getOlSalesPrice();
		}
		deliveryStatus = "On the way";
		customer = null;
		this.orderLines = orderLines;
		returnDate = null;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Entity getCustomer() {
		return customer;
	}

	public void setCustomer(Entity customer) {
		this.customer = customer;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}


}
