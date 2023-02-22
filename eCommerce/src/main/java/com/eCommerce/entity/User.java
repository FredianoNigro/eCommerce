package com.eCommerce.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	
	
	@OneToMany
	private List<Products> wishlist;
	@OneToMany
	private List<Products> shoppingCart;
	@OneToMany
	private List<Order> orders;
	@OneToOne
	private Generality generality;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String surname, String email, String password, List<Products> wishlist,
			List<Products> shoppingCart, List<Order> orders, Generality generality) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.wishlist = wishlist;
		this.shoppingCart = shoppingCart;
		this.orders = orders;
		this.generality = generality;
	}

	public User(String name, String surname, String email, String password, List<Products> wishlist,
			List<Products> shoppingCart, List<Order> orders, Generality generality) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.wishlist = wishlist;
		this.shoppingCart = shoppingCart;
		this.orders = orders;
		this.generality = generality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Products> getWishlist() {
		return wishlist;
	}

	public void setWishlist(List<Products> wishlist) {
		this.wishlist = wishlist;
	}

	public List<Products> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(List<Products> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Generality getGenerality() {
		return generality;
	}

	public void setGenerality(Generality generality) {
		this.generality = generality;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", password="
				+ password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, password, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(surname, other.surname);
	}


}
