package com.eCommerce.entity;



import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Type type;
	private double price;
	private String title;
	private String artist;
	private int year;
	private Genre genre;
	private int quantity;
	private String image;
	private int sale;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, Type type, double price, String title, String artist, int year, Genre genre, int quantity,
			String image, int sale) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.genre = genre;
		this.quantity = quantity;
		this.image = image;
		this.sale = sale;
	}

	public Product(Type type, double price, String title, String artist, int year, Genre genre, int quantity,
			String image, int sale) {
		super();
		this.type = type;
		this.price = price;
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.genre = genre;
		this.quantity = quantity;
		this.image = image;
		this.sale = sale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", type=" + type + ", price=" + price + ", title=" + title + ", artist=" + artist
				+ ", year=" + year + ", genre=" + genre + ", quantity=" + quantity + ", image=" + image + ", sale="
				+ sale + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artist, genre, id, image, price, quantity, sale, title, type, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(artist, other.artist) && genre == other.genre && id == other.id
				&& Objects.equals(image, other.image)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& sale == other.sale && Objects.equals(title, other.title) && type == other.type
				&& Objects.equals(year, other.year);
	}
	
	
}
