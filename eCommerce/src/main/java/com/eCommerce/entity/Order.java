package com.eCommerce.entity;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date date;
	private double totalPrice;
	private OrderTracking tracking;
	@OneToMany
	private List<Product> orderList;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, Date date, double totalPrice, OrderTracking tracking, List<Product> orderList) {
		super();
		this.id = id;
		this.date = date;
		this.totalPrice = totalPrice;
		this.tracking = tracking;
		this.orderList = orderList;
	}

	public Order(Date date, double totalPrice, OrderTracking tracking, List<Product> orderList) {
		super();
		this.date = date;
		this.totalPrice = totalPrice;
		this.tracking = tracking;
		this.orderList = orderList;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderTracking getTracking() {
		return tracking;
	}

	public void setTracking(OrderTracking tracking) {
		this.tracking = tracking;
	}

	public List<Product> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Product> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", totalPrice=" + totalPrice + ", tracking=" + tracking
				+ ", orderList=" + orderList + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, orderList, totalPrice, tracking);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(date, other.date) && id == other.id && Objects.equals(orderList, other.orderList)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice)
				&& tracking == other.tracking;
	}	



}
