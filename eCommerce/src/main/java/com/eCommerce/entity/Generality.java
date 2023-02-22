package com.eCommerce.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Generality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String shipping;
	private int cardNumber;
	
	public Generality() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Generality(int id, String shipping, int cardNumber) {
		super();
		this.id = id;
		this.shipping = shipping;
		this.cardNumber = cardNumber;
	}

	public Generality(String shipping, int cardNumber) {
		super();
		this.shipping = shipping;
		this.cardNumber = cardNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Generality [id=" + id + ", shipping=" + shipping + ", cardNumber=" + cardNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, id, shipping);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Generality other = (Generality) obj;
		return cardNumber == other.cardNumber && id == other.id && Objects.equals(shipping, other.shipping);
	}



}
