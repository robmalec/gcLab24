package co.grandcircus.lab22.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	
	@Id // this is used to represent the primary key and will always be @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // 
	private Integer id;	
	
	
	String name;
	String description;
	double price;
	int quantity;

	
	public Product() {}
	
	public Product(int quantity, double price, String name, String description) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.name = name;
		this.description = description;
	}

	
	public Product(int id, int quantity, double price, String name, String description) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "$id=" + id + "&quantity=" + quantity + "&price=" + price + "&name=" + name + "&description="
				+ description;
	}
	
	
	
}
