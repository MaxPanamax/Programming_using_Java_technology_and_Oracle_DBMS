package Packed_HW_8;

public class Product {

	private String name;
	private Products_Arry categoryProduct;
	private double price;

	public Product(String name, Products_Arry categoryProduct, double price) {
		this.name = name;
		this.categoryProduct = categoryProduct;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Products_Arry getCategoryProduct() {
		return categoryProduct;
	}

	public void setCategoryProduct(Products_Arry categoryProduct) {
		this.categoryProduct = categoryProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "{\"name: \"" + name + "\"category: \"" + categoryProduct + "\"price: \"" + price + "}";
	}
}
