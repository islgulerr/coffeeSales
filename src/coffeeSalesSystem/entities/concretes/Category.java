package coffeeSalesSystem.entities.concretes;

import java.util.ArrayList;

public class Category {
	private String categoryName;
	ArrayList<Product> products;

	public Category(String categoryName, ArrayList<Product> products) {
		this.categoryName = categoryName;
		this.products = products;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
}
